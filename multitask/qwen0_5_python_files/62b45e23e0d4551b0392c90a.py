def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.

Also keep a record of any content digests different from those in the root inventory
so that we can also check them when validating the content.

version_dirs is an array of version directory names and is assumed to be in
version sequence (1, 2, 3...).
	"""
	for dir_name in version_dirs:
		if not os.path.isdir(dir_name):
			continue

		# Check for empty directories.
		if len(os.listdir(dir_name)) == 0:
			continue

		# Check for non-inventory files.
		if not self.is_inventory_file(dir_name):
			continue

		# Check for non-versions.
		if not self.is_versioned(dir_name):
			continue

		# Check for versions with no inventories.
		if not self.has_versions(dir_name):
			continue

		# Check for versions with inconsistent inventories.
		if not self.check_versions(dir_name):
			continue

		# Check for versions with inconsistent content digests.
		if not self.check_content_digests(dir_name):
			continue

		# Check for versions with inconsistent content digests.
		if not self.check_content_digests(dir_name):
			continue

		# Check for versions with inconsistent content digests.
		if not self.check_content_digests(dir_name):
			continue

		# Check for versions with inconsistent content digests.
		if not self.check_content_digests(dir_name):
			continue

		# Check for versions with inconsistent content digests.
		if not self.check_content_digests(dir_name):
			continue

		# Check for versions with inconsistent content digests.
		if not self.check_content_digests(dir_name):
			continue

		# Check for versions with inconsistent content digests.
		if not self.check_content_digests(dir_name):
			continue

		# Check for versions with inconsistent content digests.
		if not self.check_content_digests(dir_name):
			continue

		# Check for versions with inconsistent content digests.
		if not self.check_content_digests(dir_name):
			continue

		# Check for versions with inconsistent content digests.
		if not self.check_content_digests(dir_name):
			continue

		# Check for versions with inconsistent content digests.
		if not self.check_content_digests(dir_name):
			continue

		# Check for versions with inconsistent content