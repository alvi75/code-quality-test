def xargs(
        cmd: tuple[str, ...],
        varargs: Sequence[str],
        *,
        color: bool = False,
        target_concurrency: int = 1,
        _max_length: int = _get_platform_max_length(),
        **kwargs):
    """
	Simplified Implementation of Xargs in Linux
	"""
    if not isinstance(cmd, (list, tuple)):
        raise TypeError("cmd must be a list or tuple")
    if not isinstance(varargs, (list, tuple)):
        raise TypeError("varargs must be a list or tuple")

    # If we have no arguments to pass, just return the command.
    if len(varargs) == 0:
        yield cmd
        return

    # We need to split up the arguments into chunks that will fit within the
    # maximum length for a single command line.
    args_chunks = _chunk_args(varargs, max_length=_max_length)

    # Now we can iterate over each chunk and build the command with the
    # appropriate number of arguments.
    for i, args_chunk in enumerate(args_chunks):
        new_cmd = list(cmd)
        new_cmd.extend(args_chunk)
        yield new_cmd