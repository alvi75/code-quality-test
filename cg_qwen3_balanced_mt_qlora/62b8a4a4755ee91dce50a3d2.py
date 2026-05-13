def _fromutc(self, dt):
	"""
	Given a timezone datetime in a given timezone, calculates a timezone datetime in a new timezone.
	"""
	if not isinstance(dt, datetime):
		raise TypeError("dt must be a datetime instance")
	if not isinstance(dt.tzinfo, tzinfo):
		raise ValueError("dt must have a valid tzinfo attribute")

	# If we're converting to the same time zone, just return the input as is.
	if self == dt.tzinfo:
		return dt

	# Normalize the input to this time zone, then convert it.
	dt = self.normalize(dt)
	return self._make_datetime(dt.year, dt.month, dt.day,
								dt.hour, dt.minute, dt.second, dt.microsecond,
								self)