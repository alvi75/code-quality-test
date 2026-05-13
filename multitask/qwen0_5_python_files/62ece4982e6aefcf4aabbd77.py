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

	freq = frequency.strip()
	if freq.lower() == 'always':
		return None
	
	# Parse the frequency
	number, unit = re.findall(r'(\d+)(?:\s*[a-zA-Z]+)?', freq)[0:2]
	number = int(number)
	if unit.lower() in ('days', 'hours'):
		number *= 60 * 60
	elif unit.lower() in ('minutes',):
		number *= 60
	elif unit.lower() in ('seconds',):
		number *= 1
	else:
		raise ValueError('Invalid frequency %r' % (freq,))
	
	# Parse the unit
	if unit.lower() in ('weeks',):
		number *= 7
	elif unit.lower() in ('months',):
		number *= 30
	elif unit.lower() in ('years',):
		number *= 365
	else:
		raise ValueError('Invalid frequency %r' % (freq,))
	
	return timedelta(**{unit: number})