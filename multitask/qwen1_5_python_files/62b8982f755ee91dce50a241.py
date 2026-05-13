def normalized(self):
		"""
		Normalize all units of time to integers.
		"""
		return self.__class__(self.days, self.hours, self.minutes, self.seconds)