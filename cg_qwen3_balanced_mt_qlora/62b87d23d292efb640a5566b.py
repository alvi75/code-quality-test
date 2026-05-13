def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	if not isinstance(commands, list):
		commands = [commands]

	for cmd in commands:
		cmd_args = cmd.split()
		cmd_args.extend(args)
		if verbose:
			print("Running: %s" % " ".join(cmd_args))
		p = subprocess.Popen(cmd_args,
			cwd=cwd,
			env=env,
			stderr=subprocess.PIPE if hide_stderr else None)
		out, err = p.communicate()
		if p.returncode != 0:
			raise Exception("Command failed: %s\n%s" % (cmd, out.decode()))