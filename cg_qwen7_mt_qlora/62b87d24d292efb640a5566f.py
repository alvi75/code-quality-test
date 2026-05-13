def render(pieces, style):
	"""
	Input pieces and a style, render the pieces to the corresponding style.
	"""

	if not isinstance(style, Style):
		raise TypeError("style must be of type Style")

	result = []
	for piece in pieces:
		if isinstance(piece, str):
			result.append(piece)
		elif isinstance(piece, (list, tuple)):
			result.extend(render(piece, style))
		else:
			result.append(str(piece))

	return style.join(result)