def fix_namespace_prefix_w(content):
	"""
	Replace "w:st=" in content with "w-st=".
	"""
	namespace = re.compile(r' xmlns:w=(?P<namespace>.*)"')
	match = namespace.search(content)
	if match:
		namespacePrefixW = match.group('namespace')
		content = re.sub(
			r'\s*xmlns\:w=' + re.escape(namespacePrefixW),
			'',  # replace it with nothing, effectively removing it
			content,
			flags=re.IGNORECASE
		)

	return content