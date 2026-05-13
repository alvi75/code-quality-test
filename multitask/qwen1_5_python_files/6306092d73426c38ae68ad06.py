def get_silent_args(self, args):
	"""
	list of silenced argument

:param args: The received arguments.
:return: list, slienced argument names
	"""
	silence = []
	for arg in args:
	    if isinstance(arg, (list, tuple)):
	        silence.extend(self.get_silent_args(arg))
	    elif isinstance(arg, dict):
	        for key in arg.keys():
	            if key.startswith('_'):
	                silence.append(key)
	    else:
	        silence.append(arg)

	return silence