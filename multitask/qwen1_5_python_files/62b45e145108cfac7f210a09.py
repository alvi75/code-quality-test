def check_digests_present_and_used(self, manifest_files, digests_used):
	"""
	Check all digests in manifest that are needed are present and used. Return error() in the class.
	"""
	for digest in self.digests:
		if digest not in digests_used:
			raise errors.DigestNotPresentInManifest(
				digest=digest,
				manifest_path=self.path,
				missing_digests=sorted(set(digest) - set(digests_used)),
			)

		file_paths = [f for f in manifest_files if f.startswith("/")]
		for file_path in file_paths:
			if file_path not in digests_used[digest]:
				raise errors.DigestUsedForFileMissingDigest(
					digest=digest,
					file_path=file_path,
					manifest_path=self.path,
				)