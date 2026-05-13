def process_text_links(text):
	"""
	Process links in text, adding some attributes and linkifying textual links.
	"""

	if not text:
		return ''

	text = re.sub(r'(\s+)([a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6})', r'\1<a href="mailto:\2">\2</a>', text)
	text = re.sub(r'(http[s]?://(?:[a-zA-Z]|[0-9]|[$-_@.&+]|[!*\\(\\),]|(?:%[0-9a-fA-F][0-9a-fA-F]))+)', r'<a href="\1" target="_blank">\1</a>', text)

	return text