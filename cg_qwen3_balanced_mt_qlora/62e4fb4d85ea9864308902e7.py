def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Complement the full path to exe and return it in its original form
	"""
	if len(cmd) == 1:
		cmd = (cmd[0],)
		if not os.path.isabs(cmd[0]):
			cmd = (shutil.which(cmd[0]),)
	return cmd