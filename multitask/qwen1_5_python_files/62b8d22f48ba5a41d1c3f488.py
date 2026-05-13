def popitem(self):
		"""
		Remove a pair from the right side of the heap, returning its key-value pair.

		>>> h = FibonacciHeap()
		>>> h.update(1)
		(0, 1)
		>>> h.popitem()
		(1, 1)
		"""
		if self._size == 0:
			raise KeyError('popitem() called on empty FibonacciHeap')

		top = self._items[0][2]
		del self._items[0][2]

		self._keys[top] = None

		while len(self._items) > 1 and self._items[0][2] == top:
			top = self._items[0][2]
			del self._items[0][2]

		if not self._items:
			self._min = None
			self._size = 0
			return

		self._heapify_down()

		return (top, self._items[0][1])