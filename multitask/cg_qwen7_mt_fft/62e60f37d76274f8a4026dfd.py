def dehydrate_time(value):
	"""
	Use ticks in the Time class to generate the Structure class.
	"""
	if not isinstance(value, datetime.time):
		raise ValueError('Cannot dehydrate time without a value of type `datetime.time`.')
	return struct.pack(
		TIME_FORMAT,
		value.hour,
		value.minute,
		value.second,
		int(round(1000 * value.microsecond / 604800))
	)