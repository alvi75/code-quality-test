def dehydrate_timedelta(value):
	"""
	Use the value in timedelta to generate the Structure class.
	"""
	return Structure(
		value.total_seconds(),
		value.microseconds,
		value.days,
		value.seconds,
		value.minute,
		value.hour,
	)