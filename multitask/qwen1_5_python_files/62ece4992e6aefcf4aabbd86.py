def _dump_string(obj, dumper=None):
    """
    Given a python object and serialize it into a YAML stream

    Args:
        obj: python object

    Returns:
        YAML stream
	"""
    if isinstance(obj, str):
        return obj.encode('utf-8')
    else:
        return yaml.dump(obj, default_flow_style=False)