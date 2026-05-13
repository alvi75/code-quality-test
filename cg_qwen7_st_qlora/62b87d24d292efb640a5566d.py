def plus_or_dot(pieces):
	"""
	Return "." If the closet-tag of the pieces contains "+", otherwise, return "+".
	"""
	if any(piece[-1] == '+' for piece in pieces):
		return '.'
	else:
		return '+'