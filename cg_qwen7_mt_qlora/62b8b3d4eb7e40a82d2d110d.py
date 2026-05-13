def _c_optimizations_required():
	"""
	Return a true value if the C optimizations are required.
	"""

	if not os.path.exists(C_OPTIMIZATIONS_PATH):
		return True

	with open(C_OPTIMIZATIONS_PATH, 'r') as f:
		lines = [l.strip() for l in f.readlines()]

	for line in lines:
		if line.startswith('C_OPTIMIZATIONS'):
			return False

	return True