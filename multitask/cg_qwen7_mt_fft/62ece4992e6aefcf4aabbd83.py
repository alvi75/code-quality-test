def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	A list of command is given. Run the given command(s) with the given arguments use a subprocess. Return the running result (stdout and returncode)
	"""
	if isinstance(commands, basestring): commands = [commands]
	args_list = []
	for cmd in commands:
		args_list.append([cmd] + list(args))
	return multi_cmd_run(args_list, cwd=cwd, verbose=verbose, hide_stderr=hide_stderr, env=env)