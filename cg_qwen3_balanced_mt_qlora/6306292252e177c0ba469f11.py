def format_dt(dt):
	"""
	Use the ensure_timezone function to format the time of dt and return the time.
	"""
	return ensure_timezone(dt).strftime('%Y-%m-%d %H:%M:%S')