def render(pieces, style):
	"""
	Input pieces and a style, render the pieces to the corresponding style.
	"""
	if not isinstance(style, Style):
		raise ValueError("style must be of type Style")
	for piece in pieces:
		piece = piece.copy()
		piece.style = style
	return pieces