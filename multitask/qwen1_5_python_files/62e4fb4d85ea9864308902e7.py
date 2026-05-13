def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Complement the full path to exe and return it in its original form
	"""
	if not cmd:
		return ()

	cmd = list(cmd)
	while cmd and (not isinstance(cmd[0], str) or not os.path.exists(cmd[0])):
		cmd.pop(0)

	return tuple(cmd)