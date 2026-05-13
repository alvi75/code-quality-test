def popitem(self):
		"""
		"Remove and return the (key, value) pair most recently used.
		"""
		if not self._queue:
			raise KeyError('popitem(): empty queue')
		item = self._queue.pop()
		return item[1], item[0]