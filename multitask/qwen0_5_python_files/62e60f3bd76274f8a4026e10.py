def dehydrate_timedelta(value):
	"""
	Use the value in timedelta to generate the Structure class.
	"""
	if isinstance(value, datetime.timedelta):
		value = str(value)
	return Timedelta(value)