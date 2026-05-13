def round_half_to_even(n):
	"""
	Round a floating-point number
	"""
	return int(math.floor(float(n) + 0.5)) if n % 1 >= 0.5 else int(math.ceil(float(n) - 0.5))