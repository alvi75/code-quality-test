def _dictsum(dicts):
	"""
	Sum values with the same key in the dictionaries. And return a new dictionary.
    Example:
        given two dictionaries: dict1: {'a': 1, 'b': 2}, dict2: {'a': 5, 'b': 0}
        return a dictionary: dic:{'a': 6, 'b': 2}
    Returns: dict
	"""
	dict_out = {}
	for d in dicts:
		for k, v in d.items():
			if k not in dict_out or v > dict_out[k]:
				dict_out[k] = v
	return dict_out