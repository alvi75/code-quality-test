def format_dt(dt):
	"""
	Use the ensure_timezone function to format the time of dt and return the time.
	"""
	if not isinstance(dt, datetime.datetime):
		raise TypeError("dt must be a datetime object")
	return ensure_timezone(datetime.datetime.combine(
		datetime.date.today(), dt.time()))