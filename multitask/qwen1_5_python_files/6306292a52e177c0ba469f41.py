def test_tag(tag: str) -> bool:
	"""
	Checks whether each character in the LEEGAL_TAG_CHARS belongs to a tag. If any character belongs to a tag, the value False is returned. Otherwise, the value True is returned.
	"""
	if len(tag) > 100:
		return False

	for char in tag:
		if char not in LEGAL_TAG_CHARS:
			return False

	return True