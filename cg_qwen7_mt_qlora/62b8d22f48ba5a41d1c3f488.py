def popitem(self):
	"""
	Remove the value corresponding to the first inserted key and returns the key and value in tuple format.
	"""
	if self._first is None:
		raise KeyError('pop from empty OrderedDict')
	k = self._first.key
	v = self._first.value
	self._remove_first()
	return k, v