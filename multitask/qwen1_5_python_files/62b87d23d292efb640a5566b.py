def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	if isinstance(commands, str):
		commands = [commands]

	for cmd in commands:
		cmdargs = shlex.split(cmd) if isinstance(cmd, six.string_types) else list(cmd)
		res = _run_subprocess(cmdargs, args, cwd=cwd, verbose=verbose, hide_stderr=hide_stderr, env=env)

		if res['retcode'] != 0:
			raise subprocess.CalledProcessError(res['stdout'], cmd)