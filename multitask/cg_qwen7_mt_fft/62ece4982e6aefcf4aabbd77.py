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

	frequency = frequency.strip().lower()
	match = re.match(r"(\d*)\s*(min|mins|hour|hours|day|days|week|weeks)$", frequency)
	if match:
		units = match.group(2)
		if units in ["min", "mins"]:
			return timedelta(minutes=int(match.group(1)))
		elif units in ["hour", "hours"]:
			return timedelta(hours=int(match.group(1)))
		elif units in ["day", "days"]:
			return timedelta(days=int(match.group(1)))
		elif units in ["week", "weeks"]:
			return timedelta(weeks=int(match.group(1)))

	raise ValueError("Frequency '{}' could not be parsed".format(frequency))