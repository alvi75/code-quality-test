def pop_u16(self):
	"""
	Remove the last two elements in self.data and return
	"""
	if len(self.data) < 2:
		raise IndexError("pop from empty buffer")
	return (self.data.pop() << 8) + self.data.pop()