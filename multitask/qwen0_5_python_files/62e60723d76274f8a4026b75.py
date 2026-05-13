def round_half_to_even(n):
	"""
	Round a floating-point number
	"""
	if n % 1 == 0:
		return int(n)
	else:
		return int(round(n / 2)) * 2