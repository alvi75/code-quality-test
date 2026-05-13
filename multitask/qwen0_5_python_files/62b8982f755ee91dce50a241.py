def normalized(self):
	"""
	Normalize all units of time to integers.
	"""
	for k in self.keys():
		self[k] = int(round(self[k]))