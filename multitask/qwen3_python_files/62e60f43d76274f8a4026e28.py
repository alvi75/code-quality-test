def hydrate_time(nanoseconds, tz=None):
	"""
	Convert nanoseconds to a time in fixed format.
	"""
	if tz is None:
		tz = FixedOffsetTZInfo(0, 0)
	return datetime.datetime.utcfromtimestamp(nanoseconds / 1e9).replace(tzinfo=tz)