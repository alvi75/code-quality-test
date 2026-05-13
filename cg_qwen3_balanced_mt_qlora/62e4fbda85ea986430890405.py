def xargs(
        cmd: tuple[str, ...],
        varargs: Sequence[str],
        *,
        color: bool = False,
        target_concurrency: int = 1,
        _max_length: int = _get_platform_max_length(),
        **kwargs:
    ):
    """
    Simplified Implementation of Xargs in Linux
    """
    if not isinstance(varargs, list):
        raise TypeError("varargs must be a list")

    if len(cmd) < 2:
        raise ValueError("cmd must have at least two elements")

    # TODO: add support for quoting
    # TODO: add support for pipes

    # TODO: add support for -I{pattern} option
    # TODO: add support for -t option
    # TODO: add support for -L option
    # TODO: add support for -0 option
    # TODO: add support for -P option
    # TODO: add support for -E option
    # TODO: add support for -n option
    # TODO: add support for -s option
    # TODO: add support for -I option
    # TODO: add support for -p option
    # TODO: add support for -r option
    # TODO: add support for -I{pattern} option
    # TODO: add support for -t option
    # TODO: add support for -L option
    # TODO: add support for -0 option
    # TODO: add support for -P option
    # TODO: add support for -E option
    # TODO: add support for -n option
    # TODO: add support for -s option
    # TODO: add support for -I option
    # TODO: add support for -p option
    # TODO: add support for -r option
    # TODO: add support for -I{pattern} option
    # TODO: add support for -t option
    # TODO: add support for -L option
    # TODO: add support for -0 option
    # TODO: add support for -P option
    # TODO: add support for -E option
    # TODO: add support for -n option
    # TODO: add support for -s option
    # TODO: add support for -I option
    # TODO: add support for -p option
    # TODO: add support for -r option
    # TODO: add support for -I{