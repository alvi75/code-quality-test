def is_gitbash():
	"""
	Check whether the current program is run in a Windows gitbash terminal

    Returns:
            boolean, True if gitbash else False
	"""

	if os.name == 'nt':
		try:
			return sys.__stdin__.encoding.lower() == 'utf-8'
		except AttributeError:
			pass
	return False