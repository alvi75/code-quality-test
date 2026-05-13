def process_text_links(text):
	"""
	def process_text_links(text):
	"""
	text = re.sub(r'(\b)(https?://[^\s]+)', r'\1<a href="\2" target="_blank">\2</a>', text)
	return text