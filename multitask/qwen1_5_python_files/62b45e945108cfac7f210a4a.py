def validate_hierarchy(self, validate_objects=True, check_digests=True, show_warnings=False):
	"""
	Validate storage root hierarchy.

Returns:
    num_objects - number of objects checked
    good_objects - number of objects checked that were found to be valid
	"""
	num_objects = 0
	good_objects = 0

	for dirpath, dirs, files in os.walk(self.root_dir):

		dirpath = dirpath[len(self.root_dir):]

		if not dirpath.startswith("/"):
			dirpath = "./" + dirpath

		if self.is_valid_path(dirpath) is False:
			self.logger.warning("Invalid path: %s", dirpath)
			continue

		num_objects += len(dirs)

		for f in files:
			full_f = os.path.join(dirpath, f)
			if self.is_valid_path(full_f) is False:
				self.logger.warning("Invalid file name: %s", full_f)
				continue

			if self.is_valid_file(full_f) is False:
				self.logger.warning("Invalid file: %s", full_f)
				continue

			if validate_objects is True:
				try:
					with open(full_f, "rb") as fp:
						data = fp.read()
				except Exception as e:
					self.logger.error("Error reading %s: %s", full_f, str(e))
					continue

				if data != self.get_data(fp.name):
					self.logger.warning(
						"Data does not match for %s (got %s, expected %s)",
						full_f,
						hexlify(data),
						hexlify(self.get_data(fp.name)),
					)
					continue

			if check_digests is True:
				digest = self.get_hash(full_f)
				if digest != self.file_hashes[full_f]:
					self.logger.warning(
						"Hash does not match for %s (got %s, expected %s)",
						full_f,
						hexlify(digest),
						hexlify(self.file_hashes[full_f]),
					)
					continue

			good_objects += 1

		if show_warnings is True:
			warnings = [
				warning
				for warning in self.warnings
				if warning["file"] == dirpath or (
					warning["file"] == ""
					and warning["line"] <= 1
					and warning["column"] <= 1
				)
			]
			for warning in warnings:
				self.logger.warning(warning["