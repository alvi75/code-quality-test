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
	# TODO: This is a hack to get around the fact that xargs can be used with
	#       python 2.7.9+ but not 3.x. It should be fixed when this issue is
	#       fixed.
	if sys.version_info[0] < 3:
		cmd = [cmd]
	for arg in varargs:
		cmd.append(arg)
	return xargs_cmd(cmd=cmd, color=color, target_concurrency=target_concurrency, _max_length=_max_length, **kwargs)