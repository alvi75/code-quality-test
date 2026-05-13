def fix_namespace_prefix_w(content):
	"""
	Replace "w:st=" in content with "w-st=".
	"""
	return re.sub(r'(?<=\s)w:st=', 'w-st=', content, flags=re.IGNORECASE)