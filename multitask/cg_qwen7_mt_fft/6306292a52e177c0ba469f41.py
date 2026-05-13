def test_tag(tag: str) -> bool:
	"""
	Checks whether each character in the LEEGAL_TAG_CHARS belongs to a tag. If any character belongs to a tag, the value False is returned. Otherwise, the value True is returned.
	"""
	return not any([char in tag for char in LEEGAL_TAG_CHARS])