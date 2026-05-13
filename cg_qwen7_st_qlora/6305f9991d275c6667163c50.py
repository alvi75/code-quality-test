def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.

Args:
    before: Split file before these delimiters.
    after: Split file after these delimiters.
	"""

	if not isinstance(before, bytes):
		raise TypeError("before must be a bytes object")
	if not isinstance(after, bytes):
		raise TypeError("after must be a bytes object")

	self._cut_before = before
	self._cut_after = after