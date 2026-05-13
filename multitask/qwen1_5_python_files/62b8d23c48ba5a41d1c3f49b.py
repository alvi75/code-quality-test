def popitem(self):
	"""
	"Pop and return the (key, value) pair most recently used."
	"""
	try:
		key = self._keys.pop()
	except KeyError:
		raise KeyError("Set is empty")
	value = self[key]
	del self[key]
	return key, value