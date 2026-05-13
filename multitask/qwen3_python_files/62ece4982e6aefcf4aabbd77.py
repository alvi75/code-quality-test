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

	if frequency.lower() == 'always':
		return None

	frequency = frequency.strip()

	if not re.match(r'^\d+\s*[a-zA-Z]+$', frequency):
		raise ValueError("Frequency must be in the form of <number> <timeunit>, got %r" % frequency)

	number, timeunit = frequency.split(' ', 1)
	number = int(number)

	if not timeunit in TIMEUNITS:
		raise ValueError("Unrecognized time unit: %r" % timeunit)

	return datetime.timedelta(**{TIMEUNITS[timeunit]: number})