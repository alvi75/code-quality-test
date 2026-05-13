def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.

Also keep a record of any content digests different from those in the root inventory
so that we can also check them when validating the content.

version_dirs is an array of version directory names and is assumed to be in
version sequence (1, 2, 3...).
	"""

	# Check for missing inventories.
	for i in range(0,len(version_dirs)):
		if not os.path.exists(os.path.join(self.root_dir, version_dirs[i], 'inventory')):
			raise Exception('Missing inventory file at %s' % os.path.join(self.root_dir, version_dirs[i], 'inventory'))

	# Check for duplicate entries in the inventory files.
	inventory = self.get_inventory()
	digests = {}
	for i in range(0,len(version_dirs)):
		version_inventory = self.get_inventory(version=version_dirs[i])
		for digest in version_inventory:
			if digest in inventory:
				if inventory[digest] != version_inventory[digest]:
					self.different_digests.append(digest)
			else:
				inventory[digest] = version_inventory[digest]
	return inventory