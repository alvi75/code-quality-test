def parse_frequency(frequency):
	"""
	Given a frequency string with a number and a unit of time, return a corresponding
     datetime.timedelta instance.
     If the frequency is None or "always", return None.
     Raise ValueError if the given frequency cannot be parsed.
     For instance, given "3 timeunit", return datetime.timedelta(timeunit=3)

     @param frequency :  A frequency string "number timeunit"

    @return str, the corresponding datetime
	"""

	if not frequency:
		return None

	frequency = frequency.lower()
	if frequency == 'always':
		return None

	try:
		number, unit = frequency.split(' ', 1)
	except ValueError:
		raise ValueError("Invalid frequency: %s" % frequency)

	if unit in ('second', 'seconds'):
		return timedelta(seconds=int(number))
	elif unit in ('minute', 'minutes'):
		return timedelta(minutes=int(number))
	elif unit in ('hour', 'hours'):
		return timedelta(hours=int(number))
	elif unit in ('day', 'days'):
		return timedelta(days=int(number))
	else:
		raise ValueError("Unknown time unit: %s" % unit)