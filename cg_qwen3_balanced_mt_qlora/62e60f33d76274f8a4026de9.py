def dehydrate_point(value):
	"""
	The structure class is generated based on the value length.
	"""
	if len(value) == 2:
		return {'x': value[0], 'y': value[1]}
	elif len(value) == 3:
		return {'x': value[0], 'y': value[1], 'z': value[2]}
	else:
		raise ValueError('Invalid point value')