def find_tags(text: str, replacer: callable = None) -> Tuple[Set, str]:
	"""
	Find tags in text.

Tries to ignore tags inside code blocks.

Optionally, if passed a "replacer", will also replace the tag word with the result
of the replacer function called with the tag word.

Returns a set of tags and the original or replaced text.
	"""

	tags = set()
	replaced_text = text

	if replacer:
		def replacer_wrapper(match):
			tag = match.group(0)
			new_tag = replacer(tag)

			if new_tag != tag:
				tags.add(new_tag)

			return new_tag

		replaced_text = re.sub(r'\b' + TAG_REGEX + r'\b', replacer_wrapper, text)

	else:
		for match in re.finditer(r'\b' + TAG_REGEX + r'\b', text):
			tags.add(match.group(0))

	return tags, replaced_text