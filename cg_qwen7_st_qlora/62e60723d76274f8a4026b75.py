def round_half_to_even(n):
	"""
	Round a floating-point number
	"""
	if n < 0:
		return -round(-n)
	else:
		return round(n)