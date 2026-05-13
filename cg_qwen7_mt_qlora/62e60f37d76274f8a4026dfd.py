def dehydrate_time(value):
	"""
	Use ticks in the Time class to generate the Structure class.
	"""
	if value is None:
		return None

	ticks = value.ticks
	hours, remainder = divmod(ticks, 3600)
	minutes, seconds = divmod(remainder, 60)

	return {
		'hours': hours,
		'minutes': minutes,
		'seconds': seconds,
	}