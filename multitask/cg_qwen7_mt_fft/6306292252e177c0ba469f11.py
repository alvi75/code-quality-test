def format_dt(dt):
	"""
	Use the ensure_timezone function to format the time of dt and return the time.
	"""
	dt = ensure_timezone(dt)
	return dt.strftime("%Y-%m-%dT%H:%M:%S.%fZ")