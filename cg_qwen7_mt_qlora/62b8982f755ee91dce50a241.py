def normalized(self):
	"""
	Normalize all units of time to integers.
	"""
	if self._normalized:
		return

	self._seconds = int(self.seconds)
	self._minutes = int(self.minutes)
	self._hours = int(self.hours)
	self._days = int(self.days)

	self._normalized = True