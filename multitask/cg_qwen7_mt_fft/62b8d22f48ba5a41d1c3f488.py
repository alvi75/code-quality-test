def popitem(self):
		"""
		Remove the value corresponding to the first inserted key and returns the key and value in tuple format.
		"""
		if self.__len__() == 0:
			raise KeyError('list is empty')
		node = self._head[2]
		self._remove_node(node)
		return (node.key, node.value)