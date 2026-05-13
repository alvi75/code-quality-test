def pop_u16(self):
	"""
	Remove the last two elements in self.data and return
	"""
	if len(self.data) < 2:
		raise ValueError("Not enough data to pop a u16")
	return struct.unpack('>H', self.data[-2:])[0]