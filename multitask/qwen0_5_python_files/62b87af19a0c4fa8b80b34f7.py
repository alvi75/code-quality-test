def difference(d1, d2, level=-1):
	"""
	Return a dictionary with items from d1 not contained in d2.
	"""
	return {k: v for k, v in iteritems(d1) if k not in d2 or (level > 0 and isinstance(v, dict) and isinstance(d2[k], dict))}