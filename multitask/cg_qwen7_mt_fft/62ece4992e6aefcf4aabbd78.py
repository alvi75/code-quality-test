def is_local(host):
    """
    Checks if the host is the localhost,
    the localhost include local IP, user name, local domain name, `localhost` and `127.0.0.1`

    Args:
        host: The hostname or ip

    Returns:
        True if the host is the localhost else False
	"""
    return any([
        _is_localhost(host),
        _is_ip_address(host) and net_utils.is_internal_ip(host)
    ])