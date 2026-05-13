def xargs(
        cmd: tuple[str, ...],
        varargs: Sequence[str],
        *,
        color: bool = False,
        target_concurrency: int = 1,
        _max_length: int = _get_platform_max_length(),
        **kwargs:
    """Simplified Implementation of Xargs in Linux"""
    if not isinstance(cmd, (list, tuple)):
        raise TypeError("cmd must be a list or tuple")

    # TODO: Support other shells besides bash

    args = [cmd[0]]
    for arg in itertools.chain([cmd[1]], varargs):
        escaped_arg = escape_sh_chars(arg)
        length_limit = (
            _max_length - len(args) - 2 * len(escaped_arg) - 3 * target_concurrency
        )
        if len(escaped_arg) > length_limit:
            yield args + ["--"]
            args = []
        elif not args or (
            len(args) + 1 >= target_concurrency and " " in escaped_arg
        ):
            yield args + ["--"]
            args = []

        args.append(escaped_arg)

    if args:
        yield args