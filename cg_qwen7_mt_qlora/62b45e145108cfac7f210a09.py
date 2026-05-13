def check_digests_present_and_used(self, manifest_files, digests_used):
	"""
	Check all digests in manifest that are needed are present and used. Return error() in the class.
	"""
	for digest in self.manifest['digests']:
		if not (digest in digests_used or digest in manifest_files):
			self.error("Digest %s is listed in the manifest but not found" % digest)