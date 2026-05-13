def dehydrate_point(value):
	"""
	The structure class is generated based on the value length.
	"""
	if len(value) == 2:
		return struct.pack('!dd', *value)
	elif len(value) == 3:
		return struct.pack('!ddd', *value)
	else:
		raise ValueError("Point must have either two or three components.")