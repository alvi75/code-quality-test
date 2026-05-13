def dehydrate_time(value):
	"""
	Use ticks in the Time class to generate the Structure class.
	"""
	if not isinstance(value, Time):
		raise TypeError("expected instance of Time")
	return value.ticks