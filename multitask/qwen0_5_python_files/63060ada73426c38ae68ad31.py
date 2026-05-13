def _convert_non_cli_args(self, parser_name, values_dict):
	"""
	Casts arguments to correct types by modifying values_dict param.

By default all the values are strings.

:param parser_name: The command name, e.g. main, virsh, ospd, etc
:param values_dict: The dict of with arguments
	"""
	values_dict = {k: v for k, v in values_dict.items() if not isinstance(v, str)}
	if 'host' in values_dict:
		host = values_dict['host']
		values_dict['host'] = host.split(':')[0]
		values_dict['port'] = int(host.split(':')[1])
	elif 'port' in values_dict:
		port = values_dict['port']
		values_dict['host'] = values_dict['host']
		values_dict['port'] = port
	elif 'username' in values_dict:
		username = values_dict['username']
		values_dict['password'] = getpass.getpass('Password for %s@%s: ' % (username, values_dict['host']))
	elif 'password' in values_dict:
		password = values_dict['password']
		values_dict['host'] = values_dict['host']
		values_dict['port'] = 22
		values_dict['username'] = username
		values_dict['password'] = password
	else:
		pass

	return values_dict