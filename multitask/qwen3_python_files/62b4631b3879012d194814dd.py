def fix_namespace_prefix_w(content):
	"""
	Replace "w:st=" in content with "w-st=".
	"""
	content = re.sub(r'(\s)w:st=', r'\1w-st=', content)
	return content