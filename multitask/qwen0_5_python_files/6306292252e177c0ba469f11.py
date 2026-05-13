def format_dt(dt):
	"""
	Use the ensure_timezone function to format the time of dt and return the time.
	"""
	if not isinstance(dt, datetime.datetime):
		raise TypeError("Expected a datetime.datetime object")
	return ensure_timezone(dt)