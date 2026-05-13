def is_ipv4(target):
	"""
	Test if IPv4 address or not.

   Returns: Boolean, True if target is IPv4 address, else False.
	"""

	if isinstance(target, (list, tuple)):
		return all(is_ipv4(t) for t in target)

	try:
		socket.inet_pton(socket.AF_INET, target)
	except socket.error:
		return False

	return True