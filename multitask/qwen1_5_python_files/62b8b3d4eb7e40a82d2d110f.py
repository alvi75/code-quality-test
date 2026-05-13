def _should_attempt_c_optimizations():
	"""
	Return a true value if we use the C optimizations.
	"""
	if not sys.platform.startswith('linux'):
		return False

	import platform
	from distutils.sysconfig import get_config_var
	config_vars = {
		'BLDSHARED': 'shared',
		'BLDSHOULD_OPTIMIZE': 'optimize',
		'BLDSHOULD_DEBUG': 'debug'
	}
	for var in config_vars:
		value = get_config_var(var)
		if value != config_vars[var]:
			return False
	return True