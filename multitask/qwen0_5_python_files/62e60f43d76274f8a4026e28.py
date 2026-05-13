def hydrate_time(nanoseconds, tz=None):
	"""
	Convert nanoseconds to a time in fixed format.
	"""
	if not isinstance(nanoseconds, (int,long)):
		raise TypeError("nanoseconds must be int or long")
	if not isinstance(tz, (str,unicode)):
		raise TypeError("tz must be str or unicode")

	if tz is None:
		tz = pytz.utc

	# convert microseconds to seconds
	nanoseconds /= 1000000

	# convert to milliseconds
	nanoseconds *= 1000

	# convert to seconds
	timestamp = datetime.datetime.fromtimestamp(float(nanoseconds) / 1000.0)

	# if timezone specified, add offset
	if tz is not None:
		timestamp += pytz.timezone(tz).localize(timestamp)
	return timestamp