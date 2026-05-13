def is_ipv4(target):
	"""
	Test if IPv4 address or not.

   Returns: Boolean, True if target is IPv4 address, else False.
	"""
	try:
		ipaddress.ip_address(target)
	except ValueError:
		return False
	else:
		return True