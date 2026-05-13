def run_command(commands, args, cwd=None, verbose=False, hide_stderr=False, env=None):
	"""
	Call the given command(s).
	"""
	if isinstance(commands, basestring):  # commands is a string (probably a program name)
		commands = [commands]
	assert len(args) == len(commands), "len(%s) != %s" % (args, len(commands))
	cmds = []
	for i in range(len(commands)):
		cmd = shlex.split(commands[i])
		cmd.extend(args[i])
		cmds.append(cmd)

	return _run_cmds(cmds, cwd=cwd, verbose=verbose, hide_stderr=hide_stderr, env=env)