def _fromutc(self, dt):
	"""
	Given a timezone datetime in a given timezone, calculates a timezone datetime in a new timezone.
	"""
	if self.tz is None:
		return dt.astimezone(self.tz)
	else:
		return dt.astimezone(pytz.timezone(self.tz))