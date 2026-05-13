def next_version(version):
	"""
	Given next version identifier following existing pattern
	"""
	if not isinstance(version, str) or len(version.split('.')) != 3:
		raise ValueError('Invalid version string: {}'.format(version))

	major, minor, patch = map(int, version.split('.'))
	patch += 1

	return '{}.{}.{}'.format(major, minor, patch)