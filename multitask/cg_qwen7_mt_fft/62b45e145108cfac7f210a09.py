def check_digests_present_and_used(self, manifest_files, digests_used):
		"""
		Check all digests in manifest that are needed are present and used. Return error() in the class.
		"""

		for platform_name, digest_list in manifest_files.items():
			if platform_name not in digests_used:
				continue

			digests_used[platform_name] = set(digests_used[platform_name])
			for digest in digest_list:
				if digest not in digests_used[platform_name]:
					self.log.error("Image with digest %s (platform: %s) was not found" % (digest, platform_name))
					return self.exit_codes.ERROR_MISSING_FROM_MANIFESTS