def validate_hierarchy(self, validate_objects=True, check_digests=True, show_warnings=False):
	"""
	Validate storage root hierarchy.

Returns:
    num_objects - number of objects checked
    good_objects - number of objects checked that were found to be valid
	"""
	# TODO: add a --verbose flag to print out all the errors
	num_objects = 0
	good_objects = 0

	if self.root is None:
		return (num_objects, good_objects)

	for obj in self.root.walk():
		if not obj.is_valid():
			if show_warnings:
				print("Warning: %s is invalid" % obj.path)
			continue

		if validate_objects:
			if not obj.validate():
				if show_warnings:
					print("Warning: %s failed validation" % obj.path)
				continue

		if check_digests:
			if not obj.check_digests():
				if show_warnings:
					print("Warning: %s has bad digests" % obj.path)
				continue

		num_objects += 1
		good_objects += 1

	return (num_objects, good_objects)