def next_version(version):
	"""
	Given next version identifier following existing pattern
	"""
	version = list(map(int, version.split('.')))
	length = len(version)
	for i in range(length - 1, -1, -1):
		if version[i] < 9:
			version[i] += 1
			break
	else:
		raise ValueError('Version number is at maximum limit')
	return '.'.join(str(v) for v in version)