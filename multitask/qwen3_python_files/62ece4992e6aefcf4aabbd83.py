def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	A list of command is given. Run the given command(s) with the given arguments use a subprocess. Return the running result (stdout and returncode)
	"""
	if not isinstance(commands, list):
		commands = [commands]
	if not isinstance(args, list):
		args = [args]

	if verbose:
		print(" ".join(commands + args))

	if env is None:
		env = os.environ.copy()

	returncode = 0
	stdout = ""
	stderr = ""

	for cmd in commands:
		try:
			process = Popen(cmd + args, stdout=PIPE, stderr=PIPE, cwd=cwd, env=env)
		except Exception as e:
			raise e

		output = process.communicate()
		stdout += output[0].decode('utf-8')
		stderr += output[1].decode('utf-8')

		if hide_stderr:
			stderr = ""

		returncode = process.returncode

		if returncode != 0:
			break

	return stdout, stderr, returncode