def plus_or_dot(pieces):
	"""
	Return "." If the closet-tag of the pieces contains "+", otherwise, return "+".
	"""
	if '+' in pieces.closetag:
		return '+'
	else:
		return '.'