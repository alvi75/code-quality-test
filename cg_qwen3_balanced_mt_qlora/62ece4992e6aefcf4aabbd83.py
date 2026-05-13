def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	A list of command is given. Run the given command(s) with the given arguments use a subprocess. Return the running result (stdout and returncode)
	"""
	if not isinstance(commands, list):
		commands = [commands]
	
	for cmd in commands:
		if verbose:
			print("Running: %s" % cmd)
		
		p = Popen(cmd, stdout=PIPE, stderr=PIPE, cwd=cwd, env=env)
		stdout, stderr = p.communicate()
		returncode = p.returncode
		
		if hide_stderr:
			return stdout.decode('utf-8'), returncode
		else:
			return stdout.decode('utf-8'), stderr.decode('utf-8'), returncode