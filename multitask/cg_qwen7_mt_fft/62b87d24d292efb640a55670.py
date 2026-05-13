def get_versions():
	"""
	Obtains the version information. If the version information cannot be obtained, the default value is returned.
	"""
	version_file_path = os.path.join(os.path.dirname(__file__), 'version.py')
	with open(version_file_path) as f:
		content = f.read()
	match = re.search(r"__version_info__\s*=\s*([^\n]+)", content)
	if match:
		return match.group(1).strip().replace(', ', '.').replace('\'', '')
	else:
		return "0+unknown.dirty"