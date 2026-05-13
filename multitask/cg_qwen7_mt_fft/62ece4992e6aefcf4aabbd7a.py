def is_gitbash():
	"""
	Check whether the current program is run in a Windows gitbash terminal

    Returns:
            boolean, True if gitbash else False
	"""
	if os.name != 'nt':
		return False
	import subprocess
	try:
		subprocess.check_output(['cmd', '/c', 'test -e "%PROGRAMFILES%\\Git\\bin\\git.exe"'], shell=True)
	except (OSError, subprocess.CalledProcessError):
		return False
	else:
		return True