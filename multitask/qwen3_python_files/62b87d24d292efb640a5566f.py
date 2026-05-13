def render(pieces, style):
	"""
	Input pieces and a style, render the pieces to the corresponding style.
	"""
	if not isinstance(pieces, list):
		pieces = [pieces]
	if len(pieces) == 0:
		return ""
	if len(pieces) == 1:
		return pieces[0].render(style)
	else:
		return "\n".join([p.render(style) for p in pieces])