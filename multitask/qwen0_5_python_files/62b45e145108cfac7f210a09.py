def check_digests_present_and_used(self, manifest_files, digests_used):
	"""
	Check all digests in manifest that are needed are present and used. Return error() in the class.
	"""
	for file_name in manifest_files:
		if not os.path.exists(file_name):
			self.error("File %s does not exist" % (file_name))
		elif not self.check_file_is_valid(file_name):
			self.error("File %s is not a valid file" % (file_name))
		else:
			file_hash = self.get_file_hash(file_name)
			if file_hash not in digests_used:
				self.error("File %s has no digest" % (file_name))