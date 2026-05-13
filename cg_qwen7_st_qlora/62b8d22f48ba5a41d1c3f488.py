def popitem(self):
	"""
	Remove the value corresponding to the first inserted key and returns the key and value in tuple format.
	"""
	if self._keys:
		key = self._keys.pop(0)
	else:
		raise KeyError('pop from empty OrderedDict')
	value = self[key]
	del self[key]
	return (key, value)