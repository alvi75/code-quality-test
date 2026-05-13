def is_local(host):
	"""
	Checks if the host is the localhost,
    the localhost include local IP, user name, local domain name, `localhost` and `127.0.0.1`

    Args:
        host: The hostname or ip

    Returns:
        True if the host is the localhost else False
	"""

	if not host:
		return False

	local_ip = get_local_ip()
	local_hostname = socket.gethostname()

	return host in (local_ip, 'localhost', '127.0.0.1', local_hostname)