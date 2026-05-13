def plus_or_dot(pieces):
	"""
	Return "." If the closet-tag of the pieces contains "+", otherwise, return "+".
	"""
	if len(pieces) == 0:
		return ""
	p = pieces[-1]
	if p.endswith("+"):
		return "."
	else:
		return "+"