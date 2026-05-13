def dehydrate_point(value):
	"""
	The structure class is generated based on the value length.
	"""
	if len(value) == 2:
		return Point2D(value)
	elif len(value) == 3:
		return Point3D(value)
	else:
		raise ValueError("Point must have either two or three coordinates.")