def plus_or_dot(pieces):
	"""
	Return "." If the closet-tag of the pieces contains "+", otherwise, return "+".
	"""
	if len(pieces) > 1:
		tag = pieces[-1]
		if tag.startswith("+"):
			return "."
		elif tag.startswith(" "):
			return "+"
		else:
			raise ValueError("Invalid tag: %s" % tag)
	else:
		return "."