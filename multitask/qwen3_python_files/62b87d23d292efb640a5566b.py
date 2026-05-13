def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	if not isinstance(commands, (list, tuple)):
		commands = [commands]

	for cmd in commands:
		if verbose:
			print(cmd)
		if env is None:
			env = os.environ.copy()
		else:
			env.update(os.environ)
		if cwd is None:
			cwd = os.getcwd()
		try:
			return subprocess.call(cmd, shell=True, stdin=subprocess.PIPE,
				stdout=sys.stdout, stderr=sys.stderr if not hide_stderr else subprocess.PIPE,
				cwd=cwd, env=env)
		except OSError as e:
			if e.errno == 2:
				raise CommandNotFound(cmd)
			raise