def next_version(version):
	"""
	Given next version identifier following existing pattern
	"""
	version = list(map(int, version.split('.')))
	for i in range(len(version)-1, -1, -1):
		if version[i] < 9:
			version[i] += 1
			break
	else:
		version.append(0)
	return '.'.join([str(v) for v in version])