def normalize_cmd(cmd: tuple[str, ...]) -> tuple[str, ...]:
	"""
	Complement the full path to exe and return it in its original form
	"""
	if len(cmd) == 0:
		return cmd

	exe = cmd[0]
	if os.path.isabs(exe):
		return cmd

	for p in sys.path:
		p = os.path.join(p, exe)
		if os.path.exists(p):
			return (p,) + cmd[1:]

	raise FileNotFoundError(f"Could not find executable {exe}")