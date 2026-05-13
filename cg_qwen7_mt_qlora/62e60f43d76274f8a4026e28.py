def hydrate_time(nanoseconds, tz=None):
	"""
	Convert nanoseconds to a time in fixed format.
	"""
	if not isinstance(nanoseconds, int) or nanoseconds < 0:
		raise ValueError("nanoseconds must be non-negative integer")
	hours = (nanoseconds // 3600000000000)
	minutes = ((nanoseconds % 3600000000000) // 60000000000)
	seconds = ((nanoseconds % 60000000000) // 1000000000)
	microseconds = ((nanoseconds % 1000000000) // 1000)

	return datetime.time(hours, minutes, seconds, microseconds, tzinfo=tz)