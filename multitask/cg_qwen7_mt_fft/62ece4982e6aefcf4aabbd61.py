def _dictsum(dicts):
    """
    Sum values with the same key in the dictionaries. And return a new dictionary.
    Example:
        given two dictionaries: dict1: {'a': 1, 'b': 2}, dict2: {'a': 5, 'b': 0}
        return a dictionary: dic:{'a': 6, 'b': 2}
    Returns: dict
    """
    d = {}
    for e in dicts:
        if type(e) is not list:
            raise TypeError("Expected argument as list of dictionaries")
        else:
            [d.update({k:v}) for k,v in e.items()]
    return d