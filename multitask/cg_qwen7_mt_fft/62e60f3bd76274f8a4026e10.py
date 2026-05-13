def dehydrate_timedelta(value):
	"""
	Use the value in timedelta to generate the Structure class.
	"""
	return Structure(b"d", int(value.total_seconds() * 1000))