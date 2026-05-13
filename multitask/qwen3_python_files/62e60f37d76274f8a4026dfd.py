def dehydrate_time(value):
	"""
	Use ticks in the Time class to generate the Structure class.
	"""
	if isinstance(value, datetime.time):
		return value.hour * 60 + value.minute
	elif isinstance(value, datetime.datetime):
		return (value.hour * 60 + value.minute) * 60 + value.second
	else:
		raise TypeError("Cannot dehydrate %s" % type(value))