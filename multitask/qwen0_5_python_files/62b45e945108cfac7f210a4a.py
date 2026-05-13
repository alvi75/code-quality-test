def validate_hierarchy(self, validate_objects=True, check_digests=True, show_warnings=False):
	"""
	Validate storage root hierarchy.

Returns:
    num_objects - number of objects checked
    good_objects - number of objects checked that were found to be valid
	"""
	num_objects = 0
	good_objects = 0

	if not self.root_path or not os.path.isdir(self.root_path):
		return (num_objects, good_objects)

	num_objects += 1
	if not self.is_valid_root():
		return (num_objects, good_objects)

	if not self.is_valid_storage():
		return (num_objects, good_objects)

	if not self.is_valid_hierarchies():
		return (num_objects, good_objects)

	if not self.is_valid_hashes():
		return (num_objects, good_objects)

	if not self.is_valid_digests():
		return (num_objects, good_objects)

	if not self.is_valid_children():
		return (num_objects, good_objects)

	if not self.is_valid_parent():
		return (num_objects, good_objects)

	if not self.is_valid_children():
		return (num_objects, good_objects)

	if not self.is_valid_parents():
		return (num_objects, good_objects)

	if not self.is_valid_children():
		return (num_objects, good_objects)

	if not self.is_valid_parents():
		return (num_objects, good_objects)

	if not self.is_valid_children():
		return (num_objects, good_objects)

	if not self.is_valid_parents():
		return (num_objects, good_objects)

	if not self.is_valid_children():
		return (num_objects, good_objects)

	if not self.is_valid_parents():
		return (num_objects, good_objects)

	if not self.is_valid_children():
		return (num_objects, good_objects)

	if not self.is_valid_parents():
		return (num_objects, good_objects)

	if not self.is_valid_children():
		return (num_objects, good_objects)

	if not self.is_valid_parents():
		return (num_objects, good_objects)

	if not self.is_valid_children():
		return (num_objects, good_objects)

	if not self.is_valid_parents():
		return (num_objects, good_objects)

	if not self.is_valid_children():
		return (num_objects, good_objects)

	if not self.is_valid_parents():
		return (num_objects, good_objects)

	if not self.is_valid_children():
		return (num_objects, good_objects)

	if not self.is_valid_parents():
		return (num_objects, good_objects)

	if not self.is_valid_children():
		return (num_objects