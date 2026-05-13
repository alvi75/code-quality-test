def is_gitbash():
	"""
	Check whether the current program is run in a Windows gitbash terminal

    Returns:
            boolean, True if gitbash else False
	"""
	if os.name == 'nt':
		if os.environ.get('BASH'):
			return True
		if os.environ.get('MSYS'):
			return True
		if os.environ.get('CYGWIN'):
			return True
		if os.environ.get('MINGW64'):
			return True
		if os.environ.get('MINGW32'):
			return True
		if os.environ.get('MSYS_NT'):
			return True
		if os.environ.get('MSYS_MINGW32'):
			return True
		if os.environ.get('MSYS_MINGW64'):
			return True
		if os.environ.get('MSYS_MINGW'):
			return True
		if os.environ.get('MSYS_MINGW32_NT'):
			return True
		if os.environ.get('MSYS_MINGW64_NT'):
			return True
		if os.environ.get('MSYS_MINGW_NT'):
			return True
		if os.environ.get('MSYS_NT_MINGW32'):
			return True
		if os.environ.get('MSYS_NT_MINGW64'):
			return True
		if os.environ.get('MSYS_NT_MINGW'):
			return True
		if os.environ.get('MSYS_NT_MINGW32_NT'):
			return True
		if os.environ.get('MSYS_NT_MINGW64_NT'):
			return True
		if os.environ.get('MSYS_NT_MINGW_NT'):
			return True
		if os.environ.get('MSYS_NT_MINGW32'):
			return True
		if os.environ.get('MSYS_NT_MINGW64'):
			return True
		if os.environ.get('MSYS_NT_MINGW'):
			return True
		if os.environ.get('MSYS_NT_MINGW32_NT'):
			return True
		if os.environ.get('MSYS_NT_MINGW64_NT'):
			return True
		if os.environ.get('MSYS_NT_MINGW_NT'):
			return True
		if os.environ.get('MSYS_NT_MINGW32'):
			return True
		if os.environ.get('MSYS_NT_MINGW64'):
			return True
		if os.environ.get('MSYS_NT_MINGW'):
			return