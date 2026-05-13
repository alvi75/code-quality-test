def normalized(self):
	"""
	Normalize all units of time to integers.
	"""
	return TimeDelta(
		days=int(math.floor(self.total_seconds())),
		hours=self.hours,
		minutes=self.minutes,
		seconds=self.seconds,
		microseconds=self.microseconds)