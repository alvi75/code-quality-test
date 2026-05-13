def _c_optimizations_required():
	"""
	Return a true value if the C optimizations are required.
	"""
	import sys

	if sys.platform == 'win32':
		return True

	if sys.platform.startswith('linux'):
		from distutils.sysconfig import get_config_var
		return bool(get_config_var('OPTIMIZE') != '-O0')

	return False