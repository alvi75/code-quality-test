def fix_namespace_prefix_w(content):
	"""
	def fix_namespace_prefix_w(content):
	"""
	return re.sub(r'(?<=\b)w:st=', 'w-st=', content, flags=re.IGNORECASE)