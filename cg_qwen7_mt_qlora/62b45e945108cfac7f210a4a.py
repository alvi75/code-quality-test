def validate_hierarchy(self, validate_objects=True, check_digests=True, show_warnings=False):
	"""
	Validate storage root hierarchy.

Returns:
    num_objects - number of objects checked
    good_objects - number of objects checked that were found to be valid
	"""

	if not self._is_root():
		raise ValueError("validate_hierarchy() can only be called on a root object")

	num_objects = 0
	good_objects = 0

	for obj in self.get_children():
		obj.validate(validate_objects=validate_objects,
						check_digests=check_digests,
						show_warnings=show_warnings)
		num_objects += 1
		good_objects += 1

	return (num_objects, good_objects)