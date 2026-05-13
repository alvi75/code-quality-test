def parse_version(s: str) -> tuple[int, ...]:
	"""
	Converts a string concatenated by dot to a tuple consisting of integers.
	"""
	return tuple(map(int, s.split('.')))