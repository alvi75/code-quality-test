def dehydrate_timedelta(value):
	"""
	Use the value in timedelta to generate the Structure class.
	"""
	if not isinstance(value, datetime.timedelta):
		raise TypeError("Expected a timedelta object")
	return {
		"days": value.days,
		"seconds": value.seconds,
		"microseconds": value.microseconds
	}