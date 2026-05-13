def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""

	if isinstance(commands, string_types):
		commands = [commands]

	for cmd in commands:
		cmd_args = shlex.split(cmd)
		cmd_args.extend(args)

		if verbose:
			print("Running: %s" % " ".join(cmd_args))

		try:
			subprocess.check_call(
				cmd_args,
				cwd=cwd,
				stderr=subprocess.STDOUT if hide_stderr else None,
				env=env or os.environ.copy(),
			)
		except subprocess.CalledProcessError as e:
			raise RuntimeError("Command failed (rc={0}): {1}".format(e.returncode, e.output))