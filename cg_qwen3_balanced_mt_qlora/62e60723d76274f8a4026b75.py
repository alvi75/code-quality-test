def round_half_to_even(n):
	"""
	Round a floating-point number
	"""
	if n - int(n) >= 0.5:
		return int(n) + 1
	elif n - int(n) <= -0.5:
		return int(n) - 1
	else:
		return int(n)