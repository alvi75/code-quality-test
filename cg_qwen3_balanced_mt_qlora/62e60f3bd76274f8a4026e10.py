def dehydrate_timedelta(value):
	"""
	Use the value in timedelta to generate the Structure class.
	"""
	return {
		"days": value.days,
		"seconds": value.seconds,
		"microseconds": value.microseconds,
	}