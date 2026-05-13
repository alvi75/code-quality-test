def parse_version(s: str) -> tuple[int, ...]:
	"""
	Converts a string concatenated by dot to a tuple consisting of integers.
	"""
	if not s:
		return ()
	parts = s.split('.')
	try:
		return tuple(int(part) for part in parts)
	except ValueError as e:
		raise ValueError(f'Invalid version number "{s}"') from e