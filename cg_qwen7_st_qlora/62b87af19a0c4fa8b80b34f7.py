def difference(d1, d2, level=-1):
	"""
	Return a dictionary with items from d1 not contained in d2.
	"""
	if isinstance(d1, dict) and isinstance(d2, dict):
		return {k: difference(v, d2.get(k), level-1)
				for k,v in d1.items() if v != d2.get(k)}
	elif isinstance(d1, list) and isinstance(d2, list):
		return [difference(x,y,level-1) for x,y in zip(d1,d2)]
	else:
		return d1