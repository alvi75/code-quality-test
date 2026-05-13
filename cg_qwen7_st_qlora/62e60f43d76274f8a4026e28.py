def hydrate_time(nanoseconds, tz=None):
	"""
	Convert nanoseconds to a time in fixed format.
	"""
	if not isinstance(nanoseconds, int) or nanoseconds < 0:
		raise ValueError("nanoseconds must be non-negative integer")
	hours = nanoseconds // (10**9 * 60 * 60)
	minutes = (nanoseconds % (10**9 * 60 * 60)) // (10**9 * 60)
	seconds = (nanoseconds % (10**9 * 60)) // 10**9
	microseconds = (nanoseconds % 10**9) // 10**3

	return datetime.time(hours=hours, minutes=minutes,
						 seconds=seconds, microsecond=microseconds)