def round_half_to_even(n):
	"""
	Round a floating-point number
	"""
	if n % 1 >= .5:
		return int(np.floor(n))
	else:
		return int(np.ceil(n))