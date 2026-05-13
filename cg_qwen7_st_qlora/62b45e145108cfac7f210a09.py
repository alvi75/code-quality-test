def check_digests_present_and_used(self, manifest_files, digests_used):
	"""
	Check all digests in manifest that are needed are present and used. Return error() in the class.
	"""
	for digest in self.manifest.digests:
		if not digest in digests_used:
			self.error("Digest %s is defined but never used" % digest)
		else:
			digest_file = os.path.join(manifest_files, "%s.md5" % digest)
			if not os.path.exists(digest_file):
				self.error("Digest file for %s does not exist" % digest)