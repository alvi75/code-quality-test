def find_tags(text: str, replacer: callable = None) -> Tuple[Set, str]:
	"""
	Find tags in text.

Tries to ignore tags inside code blocks.

Optionally, if passed a "replacer", will also replace the tag word with the result
	of the replacer function called with the tag word.

Returns a set of tags and the original or replaced text.
	"""
	tags = set()
	text = re.sub(r'```', '', text)
	for match in TAG_RE.finditer(text):
		tag = match.group(1).lower()
		if not is_code_tag(tag):
			tags.add(tag)

		if replacer:
			text = text.replace(match.group(0), replacer(tag))

	return (tags, text)