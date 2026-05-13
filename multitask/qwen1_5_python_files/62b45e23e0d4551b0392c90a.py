def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.

Also keep a record of any content digests different from those in the root inventory
so that we can also check them when validating the content.

version_dirs is an array of version directory names and is assumed to be in
version sequence (1, 2, 3...).
	"""
	for i in range(0, len(version_dirs)):
	    if not os.path.exists(os.path.join(self.root_inventory_dir, version_dirs[i])):
	        raise Exception("Version %s does not exist" % version_dirs[i])
	    elif self.content_hash_type:
	        hash_file = os.path.join(self.root_inventory_dir, version_dirs[i], '.hash')
	        with open(hash_file) as f:
	            expected_digest = f.read().strip()
	        actual_digest = self._content_sha1sum(
	            os.path.join(self.root_inventory_dir, version_dirs[i]))
	        if actual_digest != expected_digest:
	            raise Exception(
	                "Hash mismatch for version %s: expected '%s', got '%s'" %
	                (version_dirs[i], expected_digest, actual_digest))