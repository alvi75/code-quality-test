def process_text_links(text):
	"""
	Process links in text, adding some attributes and linkifying textual links.
	"""
	def _subf(matchobj):
		match = matchobj.group(0)
		if not (match.startswith('http://') or match.startswith('https://')):
			return '<a href="{}">{}</a>'.format(match, match)

		# Linkify only non-IP addresses:
		if re.match(r'\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}', match[7:-2]):
			return match

		return '<a href="{}" class="external-link">{}</a>'.format(
				'//{}'.format(match[8:]),
				match[8:])
	return re.sub(r'`[^`]+`', _subf, text)