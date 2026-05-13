def _fromutc(self, dt):
	"""
	Given a timezone datetime in a given timezone, calculates a timezone datetime in a new timezone.
	"""
	if not isinstance(dt, datetime.datetime):
		raise TypeError("datetime parameter is required")
	return dt.replace(tzinfo=None) - self.utcoffset()