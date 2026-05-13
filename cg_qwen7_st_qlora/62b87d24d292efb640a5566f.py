def render(pieces, style):
	"""
	Input pieces and a style, render the pieces to the corresponding style.
	"""
	if style == 'html':
		return html.render(pieces)
	elif style == 'text':
		return text.render(pieces)