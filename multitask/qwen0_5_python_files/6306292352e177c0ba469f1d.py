def find_tags(text: str, replacer: callable = None) -> Tuple[Set, str]:
	"""
	Find tags in text.

Tries to ignore tags inside code blocks.

Optionally, if passed a "replacer", will also replace the tag word with the result
of the replacer function called with the tag word.

Returns a set of tags and the original or replaced text.
	"""
	tag_re = re.compile(r'(?<!\w)(?:#[^\w\s]+|#[^\w\s]*\b)' + r'\w+)', flags=re.IGNORECASE)
	tag_re2 = re.compile(r'(?<!\w)(?:#[^\w\s]+|#[^\w\s]*\b)' + r'\w+)', flags=re.IGNORECASE)

	# Find all tags that match the regex
	tags = {tag for tag in tag_re.findall(text)}

	# If there's no tags, return empty set and the original text
	if not tags:
		return (set(), text)

	# Replace any tags found by the replacer
	text = tag_re.sub(replacer, text)

	# Return the set of tags and the new text
	return (tags, text)