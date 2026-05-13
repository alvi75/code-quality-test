def xargs(
        cmd: tuple[str, ...],
        varargs: Sequence[str],
        *,
        color: bool = False,
        target_concurrency: int = 1,
        _max_length: int = _get_platform_max_length(),
        **kwargs:
	"""
	Simplified Implementation of Xargs in Linux
	"""
	if not isinstance(cmd, (tuple, list)):
		cmd = shlex.split(cmd)
	elif not isinstance(cmd[0], str):
		raise TypeError("First argument to 'xargs' must be a string or sequence")
	if len(varargs) == 0:
		varargs = None

	def pipe_to_next(cmd_iterable, next_cmd):
		next_proc.stdin.write(b"".join(cmd_iterable))
		next_proc.stdin.close()
		next_proc.wait()

	def get_args(cmd_iterable):
		return b" ".join([pipes.quote(arg) for arg in cmd_iterable])

	def get_vararg_subcommands(varargs):
		subcmds = []
		for arg in varargs:
			if isinstance(arg, str):
				subcmds.append(arg)
			else:
				subcmds.extend(get_vararg_subcommands(arg))
		return subcmds

	def get_vararg_commands(varargs):
		subcmds = []
		for arg in varargs:
			if isinstance(arg, str):
				subcmds.append(arg)
			elif isinstance(arg, collections.Iterable):
				subcmds.extend(get_vararg_subcommands(arg))
			else:
				raise ValueError(f"vararg {arg} is neither a string nor iterable")
		return subcmds

	def get_commands(cmd_iterable):
		subcmds = []
		for cmd in cmd_iterable:
			if isinstance(cmd, str):
				subcmds.append(cmd)
			elif isinstance(cmd, collections.Iterable):
				subcmds.extend(get_commands(cmd))
			else:
				raise ValueError(f"cmd {cmd} is neither a string nor iterable")
		return subcmds

	cmds = get_commands(cmd)

	if target_concurrency > 1:
		shutit_global.shutit_global_object.yield_to_draw()
		pipes_2 = [None] * target_concurrency
		target_procs = []  # type: List[subprocess.Popen]
		for i in range(target_concurrency):
			pipes_2[i] = subprocess.Popen(cmd=cmds, stdin=subprocess.PIPE, stdout=subprocess.PIPE, bufsize=-1)
			target_procs.append(pipes_2[i])
		while True:
			for j in range(len(target_procs)):
				if target_procs