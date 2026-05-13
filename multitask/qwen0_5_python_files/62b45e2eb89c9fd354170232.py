def next_version(version):
	"""
	Given next version identifier following existing pattern
	"""
	if not re.match(r'^(\d+)\.(\d+)\.(\d+)', version):
		return None

	version = list(map(int, version.split('.')))
	version[2] += 1
	return '.'.join(map(str, version))