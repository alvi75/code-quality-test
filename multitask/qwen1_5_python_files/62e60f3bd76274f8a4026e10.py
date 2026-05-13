def dehydrate_timedelta(value):
	"""
	Use the value in timedelta to generate the Structure class.
	"""
	if not isinstance(value, datetime.timedelta):
		raise TypeError("expected datetime.timedelta; got %r" % type(value))
	return _dehydrate_date_time(datetime.datetime(1970, 1, 1) + value)