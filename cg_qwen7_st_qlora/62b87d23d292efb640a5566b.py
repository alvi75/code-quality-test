def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""

	if isinstance(commands, str):
		commands = [commands]

	for cmd in commands:
		cmd = shlex.split(cmd)
		cmd.extend(args)

		if verbose:
			print(" ".join(cmd))

		p = subprocess.Popen(
			cmd,
			cwd=cwd,
			stdout=subprocess.PIPE,
			stderr=subprocess.STDOUT if hide_stderr else None,
			env=env or os.environ.copy(),
		)

		output = p.communicate()[0]
		if output:
			sys.stdout.write(output.decode('utf-8'))

		if p.returncode != 0:
			raise Exception("Command failed: %s" % " ".join(cmd))