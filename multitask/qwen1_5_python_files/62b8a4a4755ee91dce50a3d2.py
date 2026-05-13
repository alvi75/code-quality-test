def _fromutc(self, dt):
	"""
	Given a timezone datetime in a given timezone, calculates a timezone datetime in a new timezone.
	"""
	if not isinstance(dt, datetime):
		raise TypeError("Input must be a datetime object")
	return self.replace(tzinfo=pytz.utc).localize(dt.astimezone(pytz.utc), is_dst=None)