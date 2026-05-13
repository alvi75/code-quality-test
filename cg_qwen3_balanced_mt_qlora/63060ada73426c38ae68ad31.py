def _convert_non_cli_args(self, parser_name, values_dict):
	"""
	Casts arguments to correct types by modifying values_dict param.

By default all the values are strings.

:param parser_name: The command name, e.g. main, virsh, ospd, etc
:param values_dict: The dict of with arguments
	"""
	if parser_name == 'main':
		values_dict['verbose'] = bool(values_dict['verbose'])
		values_dict['debug'] = bool(values_dict['debug'])
		values_dict['log_file'] = str(values_dict['log_file'])
		values_dict['log_level'] = int(values_dict['log_level'])
		values_dict['log_format'] = str(values_dict['log_format'])
		values_dict['log_datefmt'] = str(values_dict['log_datefmt'])
		values_dict['log_max_bytes'] = int(values_dict['log_max_bytes'])
		values_dict['log_backup_count'] = int(values_dict['log_backup_count'])
		values_dict['log_file_mode'] = int(values_dict['log_file_mode'])
		values_dict['log_file_owner'] = str(values_dict['log_file_owner'])
		values_dict['log_file_group'] = str(values_dict['log_file_group'])
		values_dict['log_file_perms'] = str(values_dict['log_file_perms'])
		values_dict['log_file_dir'] = str(values_dict['log_file_dir'])
		values_dict['log_file_dir_mode'] = int(values_dict['log_file_dir_mode'])
		values_dict['log_file_dir_owner'] = str(values_dict['log_file_dir_owner'])
		values_dict['log_file_dir_group'] = str(values_dict['log_file_dir_group'])
		values_dict['log_file_dir_perms'] = str(values_dict['log_file_dir_perms'])
		values_dict['log_file_dir_prefix'] = str(values_dict['log_file_dir_prefix'])
		values_dict['log_file_dir_suffix'] = str(values_dict['log_file_dir_suffix'])
		values_dict['log_file_dir_suffix_len'] = int(values_dict['log_file_dir_suffix_len'])
		values_dict['log_file_dir_suffix_fmt'] = str(values_dict['log_file_dir_suffix_fmt'])
		values_dict['log_file_dir_suffix_fmt_len'] = int(values_dict['log_file_dir_suffix_fmt_len'])
		values_dict['log_file_dir_suffix_fmt_fmt'] = str(values_dict['log_file_dir_suffix_fmt_fmt'])
		values_dict['log_file_dir_suffix_fmt_fmt_len'] = int(values_dict['log_file_dir_suffix_fmt_fmt_len'])
		values