def hydrate_time(nanoseconds, tz=None):
	"""
	Convert nanoseconds to a time in fixed format.
	"""
	if not isinstance(nanoseconds, int):
		raise TypeError("Expected integer, received {}".format(type(nanoseconds)))

	if tz is None:
		tz = FixedOffset(0)

	return datetime.datetime(
		1970,
		1,
		1,
		hour=0,
		minute=0,
		second=0,
		tzinfo=tz,
	) + datetime.timedelta(microseconds=(nanoseconds / 1000))