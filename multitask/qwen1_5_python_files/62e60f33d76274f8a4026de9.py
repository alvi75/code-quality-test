def dehydrate_point(value):
	"""
	The structure class is generated based on the value length.
	"""
	if len(value) == 2:
		return struct.pack(">Hf", *value)
	elif len(value) == 3:
		return struct.pack(">Hfz", *value)
	else:
		raise ValueError("Point must be composed of 2 or 3 floats")