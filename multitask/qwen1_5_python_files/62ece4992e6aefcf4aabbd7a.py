def is_gitbash():
	"""
	Check whether the current program is run in a Windows gitbash terminal

    Returns:
            boolean, True if gitbash else False
	"""
	if sys.platform == 'win32':
		import os.path
		return (
			os.path.basename(os.environ['COMSPEC']).lower() ==
			'gitbash.exe'
		)
	else:
		return False