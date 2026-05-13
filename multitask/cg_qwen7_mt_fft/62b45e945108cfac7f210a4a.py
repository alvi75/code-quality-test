def validate_hierarchy(self, validate_objects=True, check_digests=True, show_warnings=False):
	"""
	Validate storage root hierarchy.

Returns:
    num_objects - number of objects checked
    good_objects - number of objects checked that were found to be valid

	"""

	def _validate_object(object_name, object_type="file"):
		if not self.has_space_separated_names():
			return False, "has space-separated names"

		if (object_type == 'directory' or object_name.endswith('/')):
			object_name = posixpath.join(object_name.rstrip('/'), '')
			if len(object_name) > 0:
				if object_name[0] != '/':
					return False, "does not start with a slash"
				elif object_name[-1] != '/':
					return False, "does not end with a slash"
			else:
				return True, ""

		if object_type == "file":
			if len(object_name) == 0:
				return False, ""
			elif object_name.count('/') > 1:
				return False, "contains more than one slash"
			elif object_name.count('.') < 1:
				return False, "does not contain a dot"
			elif object_name.startswith('.'):
				return False, "starts with a dot"
			elif object_name.endswith('.'):
				return False, "ends with a dot"
			elif object_name.count('/') == 1:
				parts = [p for p in object_name.split("/") if len(p) > 0]
				if parts[0].count('.') > 1:
					return False, "%s has more than one dot" % parts[0]

		return True, ""


	def _validate_directory(directory_name):
		if directory_name.count('/') > 1:
			return False, "more than one level deep"
		elif directory_name.count('/') == 1:
			directory_name, object_name = directory_name.split("/")
			if len(object_name) == 0:
				return False, "empty file name"
			elif object_name.count('.') > 1:
				return False, "%s has more than one dot" % object_name
			elif object_name.startswith('.'):
				return False, "starts with a dot"
			elif object_name.endswith('.'):
				return False, "ends with a dot"
		return True, ""



	self._print_header("VALIDATE HIERARCHY", sep='=')
	num_objects = 0
	good_objects = 0
	for oinfo in self.list_info