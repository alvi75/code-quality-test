def normalized(self):
	"""
	def normalized(self):
	"""
	if self.unit == 's':
		return self
	elif self.unit == 'ms':
		return TimeValue((self.value * 1000, 1))
	elif self.unit == 'us':
		return TimeValue((self.value * 1000000, 1))
	elif self.unit == 'ns':
		return TimeValue((self.value * 1000000000, 1))
	else:
		raise ValueError("Unknown unit %r" % (self.unit,))