def difference(d1, d2, level=-1):
	"""
	Return a dictionary with items from d1 not contained in d2.
	"""
	if level == -1:
		level = len(d1) + len(d2)
	return _difference(d1, d2, level)