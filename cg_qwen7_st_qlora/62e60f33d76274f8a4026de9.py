def dehydrate_point(value):
	"""
	The structure class is generated based on the value length.
	"""
	if len(value) == 2:
		structure = _Point2D
	elif len(value) == 3:
		structure = _Point3D
	else:
		raise ValueError("Invalid point: %s" % (value,))

	return structure(*value)