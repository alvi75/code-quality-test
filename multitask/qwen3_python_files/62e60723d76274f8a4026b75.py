def round_half_to_even(n):
	"""
	Round a floating-point number
	"""
	if n >= 0:
		return math.floor(n + 0.5)
	else:
		return math.ceil(n - 0.5)