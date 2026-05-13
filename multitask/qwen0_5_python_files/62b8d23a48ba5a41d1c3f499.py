def popitem(self):
	"""
	Remove and return the `(key, value)` pair least recently used.
	"""
	if not self:
		raise KeyError("pop from empty dictionary")
	self._keys = [self._keys.pop()] + self._keys[1:]
	self._values = [self._values.pop()] + self._values[1:]
	return (self._keys[-1], self._values[-1])