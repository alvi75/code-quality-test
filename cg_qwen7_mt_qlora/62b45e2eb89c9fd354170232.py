def next_version(version):
	"""
	Given next version identifier following existing pattern
	"""
	if not isinstance(version, str):
		version = str(version)
	parts = [int(x) for x in version.split('.')]
	if len(parts) == 3:
		parts[2] += 1
	elif len(parts) == 2:
		parts.append(0)
	else:
		raise ValueError("Invalid version: %s" % version)

	return '.'.join([str(x) for x in parts])