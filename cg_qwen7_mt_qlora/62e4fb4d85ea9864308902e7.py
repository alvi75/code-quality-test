def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Complement the full path to exe and return it in its original form
	"""
	if len(cmd) == 0:
		return cmd

	exe = cmd[0]
	if not os.path.isabs(exe):
		exe = which(exe)
	if not exe:
		raise FileNotFoundError(f'Could not find executable {cmd[0]}')

	cmd = (exe,) + cmd[1:]
	return cmd