def dehydrate_time(value):
	"""
	Use ticks in the Time class to generate the Structure class.
	"""
	if value is None:
		return None

	ticks = int(value)
	hours, remainder = divmod(ticks, 3600 * 1000)
	minutes, seconds = divmod(remainder, 60 * 1000)
	seconds += float(remainder - (minutes * 60 * 1000)) / 1000
	return time(hours=hours, minutes=minutes, seconds=seconds)