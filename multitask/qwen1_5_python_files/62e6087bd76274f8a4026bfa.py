def pop_u16(self):
	"""
	Return the last 2 bytes as a unit16 value.
	"""
	b0 = self.pop()
	b1 = self.pop()

	return (b0 << 8) + b1