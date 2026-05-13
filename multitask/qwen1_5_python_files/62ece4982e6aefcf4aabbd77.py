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

	try:
		number = int(frequency.split()[0])
	except ValueError:
		raise ValueError("The provided frequency '%s' could not be interpreted as a number" % frequency)
	time_unit = frequency.split()[-1]

	if time_unit == 'minutes':
		return datetime.timedelta(minutes=number)
	elif time_unit == 'seconds':
		return datetime.timedelta(seconds=number)
	elif time_unit == 'hours':
		return datetime.timedelta(hours=number)
	elif time_unit == 'days':
		return datetime.timedelta(days=number)
	elif time_unit == 'weeks':
		return datetime.timedelta(weeks=number)
	else:
		raise ValueError("Unknown time unit: %s" % time_unit)