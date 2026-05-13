def set_cut_chars(self, before: bytes, after: bytes) -> None:
	"""
	Set the bytes used to delimit slice points.

Args:
    before: Split file before these delimiters.
    after: Split file after these delimiters.
	"""
	self._cut_chars = (before, after)
	if self._cut_chars is not None:
		self._cut_chars = (self._cut_chars[0].decode('utf-8'), self._cut_chars[1].decode('utf-8'))