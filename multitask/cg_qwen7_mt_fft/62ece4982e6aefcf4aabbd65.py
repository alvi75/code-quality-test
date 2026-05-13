def parser_flags(parser):
    """
    Given an argparse.ArgumentParser instance, return its argument flags in a space-separated string.
    Args:
        script: argparse.ArgumentParser instance

    Returns:
        argument flags in a space-separated string
    """

    if not isinstance(parser, ArgumentParser):
        raise TypeError('parser must be of type {}'.format(ArgumentParser))

    args = parser.parse_args([])

    flag_list = []
    for action in parser._actions:  # pylint: disable=protected-access
        arg_name = action.dest
        arg_value = getattr(args, arg_name)
        if arg_value is None or (action.default == arg_value and not action.type):  # pragma: no cover
            continue
        elif hasattr(action, 'option_strings') and len(action.option_strings) > 0:
            flag_list.append(action.option_strings[0])
    return ' '.join(flag_list)