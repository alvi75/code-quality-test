def plus_or_dot(pieces):
	"""
	Return "." If the closet-tag of the pieces contains "+", otherwise, return "+".
	"""
	if any(piece.closet_tag == '+' for piece in pieces):
		return '.'
	else:
		return '+'