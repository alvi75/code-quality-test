def fix_namespace_prefix_w(content):
	"""
	Replace "w:st=" in content with "w-st=".
	"""
	if 'w:st=' in content:
		content = re.sub('w:st=', 'w-st=', content)
	return content