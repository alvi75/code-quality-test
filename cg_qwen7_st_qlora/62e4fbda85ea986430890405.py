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
    if not isinstance(varargs, (list, tuple)):
        raise TypeError("varargs must be a list or tuple")

    # If we have no arguments to pass then just return empty generator.
    if len(varargs) == 0:
        yield ()
        return

    # We need to make sure that we don't exceed the maximum length for the command line.
    # This is done by splitting up the input into multiple commands with the same number of args.

    # The first argument is the command itself so we subtract one from the max length.
    max_length = _max_length - len(cmd[0]) - 1

    # If we're using colors then we need to account for the extra characters used for coloring.
    if color:
        max_length -= 2 * len(colorama.Style.RESET_ALL)

    # Split the input into chunks which will fit within the max length.
    chunks = _split_input_into_chunks(varargs, max_length)
    for chunk in chunks:
        # Create a new command with the current chunk as the last argument.
        new_cmd = list(cmd[:-1])
        new_cmd.extend(chunk)
        new_cmd.append(cmd[-1])

        # Yield the new command.
        yield new_cmd