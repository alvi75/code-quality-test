def pop_u16(self):
	"""
	def pop_u16(self)
	"""
	if len(self.data) < 2:
		raise Exception("Not enough data to pop u16")
	return struct.unpack('<H', self.data[-2:])[0]