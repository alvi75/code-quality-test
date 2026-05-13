def replace_dots(value, arg):
    """
    Replaces all values of '.' to arg from the given string
    Args:
        value: old string
        arg: new string to replace '.'
    Returns:
        str, the replaced string
    """
    if not isinstance(value, basestring):
        raise TypeError("value can only be an instance of type basestring")
    if not isinstance(arg, basestring):
        raise TypeError("arg can only be an instance of type basestring")
    result = value.replace(".", arg)
    return result