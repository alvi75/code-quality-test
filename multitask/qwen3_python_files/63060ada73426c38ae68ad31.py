def _convert_non_cli_args(self, parser_name, values_dict):
	"""
	Casts arguments to correct types by modifying values_dict param.

By default all the values are strings.

:param parser_name: The command name, e.g. main, virsh, ospd, etc
:param values_dict: The dict of with arguments
	"""
	if not self._non_cli_args:
		return

	for arg in self._non_cli_args:
		arg_name = arg['name']
		arg_type = arg['type']

		if arg_name in values_dict:
			if arg_type == 'bool':
				values_dict[arg_name] = bool(values_dict[arg_name])
			elif arg_type == 'int':
				values_dict[arg_name] = int(values_dict[arg_name])
			elif arg_type == 'float':
				values_dict[arg_name] = float(values_dict[arg_name])
			elif arg_type == 'strlist':
				values_dict[arg_name] = [x.strip() for x in values_dict[arg_name].split(',')]
			elif arg_type == 'dict':
				values_dict[arg_name] = json.loads(values_dict[arg_name])
			elif arg_type == 'list':
				values_dict[arg_name] = ast.literal_eval(values_dict[arg_name])

			if arg.get('cast'):
				values_dict[arg_name] = arg['cast'](values_dict[arg_name])

			if arg.get('cast_str'):
				values_dict[arg_name] = str(values_dict[arg_name])

			if arg.get('cast_int'):
				values_dict[arg_name] = int(values_dict[arg_name])

			if arg.get('cast_float'):
				values_dict[arg_name] = float(values_dict[arg_name])

			if arg.get('cast_bool'):
				values_dict[arg_name] = bool(values_dict[arg_name])