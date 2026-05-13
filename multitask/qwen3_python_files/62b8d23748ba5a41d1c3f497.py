def popitem(self):
	"""
	def popitem(self):
	"""
	if not self:
		raise KeyError('list is empty')
	key, value = self._keys.popitem(last=False)
	del self[key]
	return key, value