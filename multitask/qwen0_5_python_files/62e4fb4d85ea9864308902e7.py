def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Complement the full path to exe and return it in its original form
	"""
	cmd = [os.path.normpath(os.path.expanduser(x)) for x in cmd]
	return tuple(cmd)