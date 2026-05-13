def find_tags(text: str, replacer: callable = None) -> Tuple[Set, str]:
	"""
	Find tags in text.

Tries to ignore tags inside code blocks.

Optionally, if passed a "replacer", will also replace the tag word with the result
of the replacer function called with the tag word.

Returns a set of tags and the original or replaced text.
	"""

	tags = set()
	replaced_text = ""
	in_code_block = False

	for line in text.splitlines():
		if not in_code_block:
			line_replaced = False
			for match in re.finditer(r"\b([a-z0-9_]+)\b", line):
				tag = match.group(1)
				if tag.startswith("_"):
					continue  # Ignore internal tags like _self
				if tag == "code":
					in_code_block = True
				else:
					tags.add(tag)

				if replacer is not None:
					replacement = replacer(tag)
					if replacement != tag:
						line = line[:match.start()] + replacement + line[match.end():]
						line_replaced = True

			if not line_replaced:
				replaced_text += line + "\n"
			else:
				replaced_text += line.replace(" ", "") + "\n"

		else:
			if line.strip().endswith("```"):
				in_code_block = False
			replaced_text += line + "\n"

	return tags, replaced_text