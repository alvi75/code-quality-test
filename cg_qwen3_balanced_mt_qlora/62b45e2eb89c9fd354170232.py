def next_version(version):
	"""
	Given next version identifier following existing pattern
	"""
	if not isinstance(version, Version):
		version = Version(version)
	
	if version.is_prerelease:
		return version.next_prerelease()
	else:
		return version.next_release()