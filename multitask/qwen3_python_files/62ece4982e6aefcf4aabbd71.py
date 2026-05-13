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
	for k, v in item.items():
		if '*' in k or '?' in k or '[' in k:
			item[k.replace('*', '[*]').replace('?', '[?]').replace('[', '[]')] = v
	del item[k]
	return item