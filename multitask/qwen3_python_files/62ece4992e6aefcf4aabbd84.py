def is_ipv4(target):
	"""
	Test if IPv4 address or not.

   Returns: Boolean, True if target is IPv4 address, else False.
	"""
	if isinstance(target, str):
		try:
			return bool(ipaddress.ip_address(target))
		except ValueError:
			return False
	elif isinstance(target, int):
		return 0 <= target < 2**32
	else:
		return False