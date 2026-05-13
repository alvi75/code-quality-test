def is_local(host):
	"""
	Checks if the host is the localhost,
    the localhost include local IP, user name, local domain name, `localhost` and `127.0.0.1`

    Args:
        host: The hostname or ip

    Returns:
        True if the host is the localhost else False
	"""
	host = str(host)
	if host.lower() == 'localhost':
		return True
	elif re.match(r'[\d]+', host) is not None:
		return True
	elif host.lower() in ['localhost', '127.0.0.1']:
		return True
	else:
		return False