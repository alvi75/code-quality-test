def validate_version_inventories(self, version_dirs):
	"""
	def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.

Also keep a record of any content digests different from those in the root inventory
so that we can also check them when validating the content.

version_dirs is an array of version directory names and is assumed to be in
version sequence (1, 2, 3...).
	"""
	if not os.path.isdir(self.root_dir):
		raise Exception("Root directory does not exist")

	version_dirs = [os.path.join(self.root_dir, d) for d in version_dirs]

	for i, v in enumerate(version_dirs):
		if not os.path.isdir(v):
			raise Exception("Version directory %s does not exist" % v)

		if i > 0:
			# Check that the version has all the inventories up to this one.
			for j in range(0, i + 1):
				if not os.path.isdir(os.path.join(v, "inventories", str(j))):
					raise Exception("Version %s is missing inventories up to version %d" % (v, j))

		# Check that the version has all the content digests up to this one.
		for j in range(0, i + 1):
			digest_file = os.path.join(v, "content-digests", "%d.txt" % j)
			if not os.path.isfile(digest_file):
				raise Exception("Version %s is missing content-digests up to version %d" % (v, j))