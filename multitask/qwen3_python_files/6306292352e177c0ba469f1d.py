def find_tags(text: str, replacer: callable = None) -> Tuple[Set, str]:
	"""
	Find tags in text.

Tries to ignore tags inside code blocks.

Optionally, if passed a "replacer", will also replace the tag word with the result
of the replacer function called with the tag word.

Returns a set of tags and the original or replaced text.
	"""
	if not text:
		return set(), text

	text = re.sub(r'\\.', r'\1', text)
	text = re.sub(r'\{[^{}]*\}', '', text)

	text = re.sub(r'<pre>.*?</pre>', '', text, flags=re.DOTALL)
	text = re.sub(r'<code>.*?</code>', '', text, flags=re.DOTALL)

	text = re.sub(r'<[^>]*?>', '', text)

	text = re.sub(r'\s+', ' ', text).strip()

	tags = set()
	for match in re.finditer(r'@(\w+)', text):
		tag = match.group(1)
		if tag not in IGNORE_TAGS:
			tags.add(tag)
			if replacer:
				text = text.replace('@' + tag, replacer(tag))

	return tags, text