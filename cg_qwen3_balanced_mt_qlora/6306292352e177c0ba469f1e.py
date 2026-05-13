def process_text_links(text):
	"""
	Process links in text, adding some attributes and linkifying textual links.
	"""
	text = re.sub(r'\[([^\]]+)\]\(([^)]+)\)', r'<a href="\2">\1</a>', text)
	text = re.sub(r'\[([^\]]+)\]', r'<a href="javascript:void(0);">\1</a>', text)
	return text