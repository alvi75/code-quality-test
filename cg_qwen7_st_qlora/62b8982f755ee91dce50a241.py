def normalized(self):
	"""
	Normalize all units of time to integers.
	"""
	if self.microseconds:
		self.seconds += int(round(self.microseconds / 10**6))
		self.microseconds = int(round(self.microseconds % 10**6))

	if self.milliseconds:
		self.seconds += int(round(self.milliseconds / 10**3))
		self.milliseconds = int(round(self.milliseconds % 10**3))

	if self.minutes:
		self.hours += int(round(self.minutes / 60))
		self.minutes = int(round(self.minutes % 60))

	if self.hours:
		self.days += int(round(self.hours / 24))
		self.hours = int(round(self.hours % 24))