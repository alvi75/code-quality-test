def render(pieces, style):
	"""
	Input pieces and a style, render the pieces to the corresponding style.
	"""
	if not isinstance(style, Style):
		style = lookup_style(style)

	return _render_plain(pieces, style) if style == PLAIN else _render_fancy(pieces, style)