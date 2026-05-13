def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	A list of command is given. Run the given command(s) with the given arguments use a subprocess. Return the running result (stdout and returncode)
	"""
	if not isinstance(args, list):
		args = [args]
	
	cmd = commands + args
	
	if verbose:
		print(" ".join(cmd))
	
	p = Popen(cmd, stdout=PIPE, stderr=STDOUT if hide_stderr else None, cwd=cwd, env=env)
	stdoutdata, _ = p.communicate()
	returncode = p.returncode
	
	if verbose:
		print(stdoutdata.decode('utf-8'))
	
	return stdoutdata, returncode