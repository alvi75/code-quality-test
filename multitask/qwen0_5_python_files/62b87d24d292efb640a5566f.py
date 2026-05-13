def render(pieces, style):
	"""
	Input pieces and a style, render the pieces to the corresponding style.
	"""
	for piece in pieces:
		piece.render(style)