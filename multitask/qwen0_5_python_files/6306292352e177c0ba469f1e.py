def process_text_links(text):
	"""
	Process links in text, adding some attributes and linkifying textual links.
	"""
	text = re.sub(r'\s+', ' ', text)
	text = re.sub(r'[\n\r\f]+', ' ', text)

	# Remove all non-ASCII characters
	text = unicodedata.normalize('NFKD', text).encode('ascii', 'ignore').decode('ascii')

	# Remove any remaining whitespace
	text = re.sub(r'\s+', ' ', text)

	# Linkify URLs
	text = re.sub(r'https?://', '<a href="http://www.google.com'>', text)
	text = re.sub(r'https?://', '<a href="https://www.google.com">', text)

	# Linkify email addresses
	text = re.sub(r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z]{2,}\b', '<a href="mailto:mailto:%s">%s</a>', text)

	return text