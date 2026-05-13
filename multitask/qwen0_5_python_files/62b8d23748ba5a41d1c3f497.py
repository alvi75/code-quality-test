def popitem(self):
	"""
	Remove and return the `(key, value)` pair least frequently used.
	"""
	if not self:
		raise KeyError("popitem(): empty priority queue")
	self._heap[0] = self._heap[-1]
	self._heap.pop()
	self._siftup(0)
	return (self._heap[0], self._heap[0][1])