def _fromutc(self, dt):
	"""
	Given a timezone datetime in a given timezone, calculates a timezone datetime in a new timezone.
	"""
	if isinstance(dt.tzinfo, FixedOffset):
		return dt.astimezone(self)
	else:
		return dt.replace(tzinfo=self).astimezone(self)