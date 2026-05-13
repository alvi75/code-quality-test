def regex_dict(item):
	"""
	Convert *.cpp keys to regex keys.
	Given a dict where the keys are all filenames with wildcards,
	convert only the keys into equivalent regexes and leave the values intact.

Args:
    item: dict to convert
Returns:
    dict with keys converted to regexes
	"""
	if isinstance(item, list):
		return [regex_dict(x) for x in item]
	elif isinstance(item, dict):
		return {re.compile(key): value for key, value in item.items()}
	else:
		return item