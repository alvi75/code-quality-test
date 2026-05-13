def hydrate_time(nanoseconds, tz=None):
	"""
	Convert nanoseconds to a time in fixed format.
	"""
	if not isinstance(nanoseconds, int) or not isinstance(tz, str):
		raise TypeError("Time must be provided as integer number of seconds since epoch and timezone identifier string.")
	return datetime.datetime.utcfromtimestamp(nanoseconds / 10 ** 9, pytz.timezone(tz))