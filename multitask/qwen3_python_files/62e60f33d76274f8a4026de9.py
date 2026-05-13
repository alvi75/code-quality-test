def dehydrate_point(value):
	"""
	The structure class is generated based on the value length.
	"""
	if len(value) == 2:
		return _dehydrate_point_2d(value)
	elif len(value) == 3:
		return _dehydrate_point_3d(value)
	else:
		raise ValueError("Invalid point: %r" % (value,))