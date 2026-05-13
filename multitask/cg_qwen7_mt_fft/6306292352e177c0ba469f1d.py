def find_tags(text: str, replacer: callable = None) -> Tuple[Set, str]:
	"""
	Find tags in text.

Tries to ignore tags inside code blocks.

Optionally, if passed a "replacer", will also replace the tag word with the result
of the replacer function called with the tag word.

Returns a set of tags and the original or replaced text.
	"""

	if not isinstance(replacer, type(None)):
		replacer = (lambda x: replacer(x))  # make sure it's a function

	tags = set()
	result = _TAGS_RE.sub(
		lambda match: f'{match.group(1)}{replacer(match.group(1))}',
		text,
		flags=re.MULTILINE | re.DOTALL
	)

	for line in result.splitlines():
		match = _START_TAG_RE.match(line)
		if match:
			tags.add(match.group(1))

	return tags, result