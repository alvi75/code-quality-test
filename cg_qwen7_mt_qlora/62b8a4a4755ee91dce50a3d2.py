def _fromutc(self, dt):
	"""
	Given a timezone datetime in a given timezone, calculates a timezone datetime in a new timezone.
	"""
	if not isinstance(dt, datetime.datetime) or not dt.tzinfo:
		raise TypeError("dt must be a timezone-aware datetime")
	return self._localize(datetime.datetime.utcfromtimestamp(dt.timestamp()), is_dst=None)