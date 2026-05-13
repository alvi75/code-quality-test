def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	definition of a command is a tuple of strings
	"""
	if not cmd:
		return ()
	if len(cmd) == 1:
		return (cmd[0],)
	if len(cmd) > 1:
		return (cmd[0],) + normalize_cmd(cmd[1:])