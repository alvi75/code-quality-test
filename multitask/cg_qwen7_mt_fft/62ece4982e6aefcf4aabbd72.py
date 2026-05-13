def unquote(name):
    """
    Remove quote from the given name with regular expression.
    Args:
        name: input name
    Returns:
        name after removal
	"""
    if len(name) > 1:
        # check for quotes, only strip if first & last char match (same type)
        if ((name[0] == '"' or name[0] == "'") and name[-1] == name[0]):
            return name[1:-1]
    return name