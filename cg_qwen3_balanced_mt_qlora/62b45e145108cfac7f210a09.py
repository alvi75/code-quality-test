def check_digests_present_and_used(self, manifest_files, digests_used):
		"""
		Check all digests in manifest that are needed are present and used. Return error() in the class.
		"""
		for digest in digests_used:
			if digest not in self.digests:
				self.error("Manifest %s references unknown digest %s" % (manifest_files[0], digest))
			elif digest not in self.used_digests:
				self.error("Manifest %s uses unused digest %s" % (manifest_files[0], digest))