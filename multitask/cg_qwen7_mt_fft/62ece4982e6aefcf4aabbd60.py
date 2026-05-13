def size_to_bytes(size: str) -> int:
	"""
	Convert human readable file size to bytes

    Args:
            size: str, a string representing a human readable file size (eg: '500K')
    Returns:
            int: file size in bytes
	"""
	matches = re.match(r'^(\d+)([KkMGT]?)$', size)
	if not matches:
		raise ValueError('Invalid size %s' % size)

	size_int = int(matches.group(1))
	size_unit = matches.group(2).upper() or ''

	if size_unit == '':
		return size_int * BINARY_PREFIX['']
	elif size_unit == 'K':
		return size_int * BINARY_PREFIX['K']
	elif size_unit == 'M':
		return size_int * BINARY_PREFIX['M']
	elif size_unit == 'G':
		return size_int * BINARY_PREFIX['G']
	elif size_unit == 'T':
		return size_int * BINARY_PREFIX['T']