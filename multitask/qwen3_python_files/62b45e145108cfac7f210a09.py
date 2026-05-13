def check_digests_present_and_used(self, manifest_files, digests_used):
	"""
	def check_digests_present_and_used(self, manifest_files, digests_used):
	"""
	"""
	for digest in digests_used:
		if not self.check_digest_present(digest, manifest_files):
			return self.error("Digest {} is missing from manifests".format(digest))
		if not self.check_digest_used(digest, manifest_files):
			return self.error("Digest {} is present but unused".format(digest))