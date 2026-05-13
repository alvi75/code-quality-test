def difference(d1, d2, level=-1):
	"""
	Return a dictionary with items from d1 not contained in d2.
	"""
	if type(d1) != type(d2):
		return True if (type(d1)==dict or type(d1)==list) else False

	if level == 0:
		return d1

	if type(d1)!=dict: return True

	for k,v in list(d1.items()):
		if not k in d2: return True
		elif difference(v,d2[k],level-1): return True

	return False