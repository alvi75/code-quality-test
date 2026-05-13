def validate_hierarchy(self, validate_objects=True, check_digests=True, show_warnings=False):
	"""
	Validate storage root hierarchy.

Returns:
    num_objects - number of objects checked
    good_objects - number of objects checked that were found to be valid
	"""
	num_objects = 0
	good_objects = 0

	for obj in self.objects():
		if not obj.is_valid:
			if show_warnings:
				print("WARNING: Object %s is not valid" % (obj.path))
			continue
		num_objects += 1
		if validate_objects:
			if not obj.validate(check_digests=check_digests):
				if show_warnings:
					print("WARNING: Object %s failed validation" % (obj.path))
				continue
		good_objects += 1

	return num_objects, good_objects