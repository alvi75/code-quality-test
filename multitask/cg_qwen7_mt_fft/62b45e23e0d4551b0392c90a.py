def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.

Also keep a record of any content digests different from those in the root inventory
so that we can also check them when validating the content.

version_dirs is an array of version directory names and is assumed to be in
version sequence (1, 2, 3...).
	"""
	root_inventory = self.get_root_inventory()
	content_digests = {}
	for vdir in version_dirs:
	    full_vdir = os.path.join(self.root_dir, vdir)
	    if not os.path.isdir(full_vdir):
		raise Exception("Missing version directory: %s" % full_vdir)

	    # Get the inventory for this version.
	    vinv = self.get_inventory(full_vdir)

	    # Make sure it matches the root inventory's format.
	    if set(root_inventory.keys()) != set(vinv.keys()):
		raise Exception(
		    "Root (%s) and version (%s) inventories do not match"
		    % (self.root_name, vdir))

	    # Check each file/directory entry in the version inventory against its
	    # counterpart in the root inventory.
	    for ent in vinv.values():
		if 'type' not in ent or 'checksum' not in ent:
		    raise Exception(
			"Invalid version inventory entry missing type "
			"or checksum: %s" % str(ent))
		elif ent['type'] == 'file':
		    csum = ent['checksum']
		    fpath = os.path.join(full_vdir, ent['name'])
		    with open(fpath, 'rb') as f:
		        local_csum = hashlib.sha1(f.read()).hexdigest()
		        if csum != local_csum:
			    yield (
				"Version '%s' file '%s' has changed since creation."
				% (vdir, ent['name']))
			    continue

		    # Keep track of all the files so that we can compare their overall digest later.
		    content_digests[ent['name']] = local_csum
		else:
		    assert False, "Unexpected inventory entry type: %s" % repr(ent)

	# Now go through the same process but in reverse - checking older versions
	# against newer ones.
	version_dirs.sort(key=lambda x: int(x))  # Sort by numeric version number
	for i in range(0, len(version_dirs)):
	    old_vdir = version_dirs[i]
	    new_vdir =