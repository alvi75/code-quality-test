def next_version(version):
	"""
	def next_version(version)
	"""
	version = list(map(int, version.split('.')))
	version[-1] += 1
	return '.'.join(map(str, version))