def plus_or_dot(pieces):
	"""
	Return "." If the closet-tag of the pieces contains "+", otherwise, return "+".
	"""
	if any("+" in piece for piece in pieces):
		return "."
	else:
		return "+"