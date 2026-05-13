def namesAndDescriptions(self, all=False):
	"""
	Returns the name and description of the current class attribute.
	"""
	if self._namesAndDescriptions is None:
		self._namesAndDescriptions = self._getNamesAndDescriptions(all)
	return self._namesAndDescriptions