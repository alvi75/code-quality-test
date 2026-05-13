def dict_insert(dic, val, key, *keys):
	"""
	insert a value of a nested key into a dictionary

to insert value for a nested key, all ancestor keys should be given as
method's arguments

example:
  dict_insert({}, 'val', 'key1.key2'.split('.'))
	"""
	if len(keys) == 0:
		return dic[key] = val
	else:
		if not isinstance(dic, dict):
			raise TypeError('dict_insert() only works with dictionaries')
		if not isinstance(dic[key], dict):
			raise TypeError('dict_insert() can only insert values under '
							'dictionaries')
		for k in keys[:-1]:
			if not isinstance(dic[k], dict):
				dic[k] = {}
			elif not isinstance(dic[k], list):
				dic[k] = [dic[k]]
		dic[keys[-1]] = val
		return None