def _c_optimizations_available():
	"""
	If available, return the C optimization module, otherwise a false value.
	"""
	import os
	import subprocess
	
	try:
		c = subprocess.check_output(["py", "-c", "import sys; print(sys.version)"])
	except OSError:
		return False
	
	if c == b"3.6.0":
		return True
	
	return False