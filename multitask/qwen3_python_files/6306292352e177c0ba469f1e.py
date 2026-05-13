def process_text_links(text):
	"""
	Process links in text, adding some attributes and linkifying textual links.
	"""
	text = re.sub(r'([^\s])(http|ftp)://(\w+)', r'\1<a href="\2://\3">\2://\3</a>\4', text)
	text = re.sub(r'([^\s])(https)://(\w+)', r'\1<a href="\2://\3">\2://\3</a>\4', text)
	text = re.sub(r'([^\s])(www)://(\w+)', r'\1<a href="http://\2/\3">\2://\3</a>\4', text)
	text = re.sub(r'([^\s])(http)://(\w+)', r'\1<a href="\2://\3">\2://\3</a>\4', text)
	text = re.sub(r'([^\s])(https)://(\w+)', r'\1<a href="\2://\3">\2://\3</a>\4', text)
	text = re.sub(r'([^\s])(http)://(\w+)', r'\1<a href="\2://\3">\2://\3</a>\4', text)
	text = re.sub(r'([^\s])(https)://(\w+)', r'\1<a href="\2://\3">\2://\3</a>\4', text)
	text = re.sub(r'([^\s])(http)://(\w+)', r'\1<a href="\2://\3">\2://\3</a>\4', text)
	text = re.sub(r'([^\s])(https)://(\w+)', r'\1<a href="\2://\3">\2://\3</a>\4', text)
	text = re.sub(r'([^\s])(http)://(\w+)', r'\1<a href="\2://\3">\2://\3</a>\4', text)
	text = re.sub(r'([^\s])(https)://(\w+)', r'\1<a href="\2://\3">\2://\3</a>\4', text)
	text = re.sub(r'([^\s])(http)://(\w+)', r'\1<a href="\2://\3">\2://\3</a>\4', text)
	text = re.sub(r'([^\s])(https)://(\w