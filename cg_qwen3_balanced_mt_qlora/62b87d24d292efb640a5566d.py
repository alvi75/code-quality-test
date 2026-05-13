def plus_or_dot(pieces):
	"""
	Return "." If the closet-tag of the pieces contains "+", otherwise, return "+".
	"""
	if len(pieces) > 0:
		return pieces[-1].endswith('+') and '.' or '+'
	else:
		return '+'