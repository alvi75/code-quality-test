def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	A list of command is given. Run the given command(s) with the given arguments use a subprocess. Return the running result (stdout and returncode)
	"""
	if isinstance(commands, str):
		commands = [commands]
	elif not isinstance(commands, (list, tuple)):
		raise TypeError("commands must be a string or a list/tuple")

	cmds = []
	for cmd in commands:
		cmds.append(cmd.format(*args))

	cmd_str = ' '.join(cmds)

	if verbose:
		print('Running: %s' % cmd_str)

	if hide_stderr:
		stderr = subprocess.STDOUT
	else:
		stderr = None

	process = subprocess.Popen(
		cmds,
		cwd=cwd,
		stdout=subprocess.PIPE,
		stderr=stderr,
		env=env,
		universal_newlines=True
	)

	output, _ = process.communicate()

	return output.strip(), process.returncode