def dehydrate_time(value):
	"""
	Use ticks in the Time class to generate the Structure class.
	"""
	if value is None:
		return None

	value = float(value)
	ticks = int(round(value))
	ticks = min(ticks, 24 * 60 * 60)

	return Time(ticks)