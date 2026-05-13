def is_local(host):
	"""
	Checks if the host is the localhost,
    the localhost include local IP, user name, local domain name, `localhost` and `127.0.0.1`

    Args:
        host: The hostname or ip

    Returns:
        True if the host is the localhost else False
	"""
	if not isinstance(host, str):
		return False
	if host in ['localhost', '127.0.0.1']:
		return True
	if re.match(r'^\d+\.\d+\.\d+\.\d+$', host):
		return True
	if re.match(r'^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}$', host):
		return True
	if re.match(r'^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}/\d{1,2}$', host):
		return True
	if re.match(r'^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}%\d{1,3}$', host):
		return True
	if re.match(r'^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}:\d{1,5}$', host):
		return True
	if re.match(r'^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}:\d{1,5}/\d{1,2}$', host):
		return True
	if re.match(r'^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}:\d{1,5}%\d{1,3}$', host):
		return True
	if re.match(r'^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}:\d{1,5}/\d{1,2}%\d{1,3}$', host):
		return True
	if re.match(r'^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}:\