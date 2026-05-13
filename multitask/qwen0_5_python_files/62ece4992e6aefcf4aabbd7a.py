def is_gitbash():
	"""
	Check whether the current program is run in a Windows gitbash terminal

    Returns:
            boolean, True if gitbash else False
	"""
	import os
	import platform
	if platform.system() == 'Windows':
		return os.path.basename(os.environ['COMSPEC']) == 'cmd.exe'
	else:
		return False