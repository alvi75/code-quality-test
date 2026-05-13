def is_ipv4(target):
	"""
	Test if IPv4 address or not.

   Returns: Boolean, True if target is IPv4 address, else False.
	"""
	if re.match(IPv4_REGEX, target) is None:
		return False

	target = [int(x) for x in target.split(".")]
	if any([x < 0 or x > 255 for x in target]):
		return False

	return True