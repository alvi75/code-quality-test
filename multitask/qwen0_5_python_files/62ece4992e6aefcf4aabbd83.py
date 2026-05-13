def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	A list of command is given. Run the given command(s) with the given arguments use a subprocess. Return the running result (stdout and returncode)
	"""
	if not isinstance(commands, list):
		commands = [commands]
	if not isinstance(args, list):
		args = [args]

	command_list = []
	for c in commands:
		command_list.append(c)

	return_code = 0
	try:
		subprocess.check_output(command_list, stderr=subprocess.STDOUT, shell=True, universal_newlines=True, cwd=cwd, env=env)
	except Exception as e:
		print("Error: " + str(e))
		return_code = -1

	if hide_stderr:
		return_code = 0 if return_code == 0 else -1

	if verbose:
		print("\n".join(command_list))

	if return_code != 0:
		raise RuntimeError("Command failed with exit code %d" % return_code)

	return return_code