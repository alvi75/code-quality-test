def is_gitbash():
	"""
	Check whether the current program is run in a Windows gitbash terminal

    Returns:
            boolean, True if gitbash else False
	"""
	if os.name == 'nt':
		try:
			return sys.__stdin__.isatty() and not sys.__stdout__.isatty()
		except AttributeError:  # pragma: no cover
			pass
	return False