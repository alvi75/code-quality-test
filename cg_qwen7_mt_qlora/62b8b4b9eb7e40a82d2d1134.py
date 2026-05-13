def namesAndDescriptions(self, all=False):
	"""
	Returns the name and description of the current class attribute.
	"""
	if not self._namesAndDescriptions:
		self._namesAndDescriptions = []
		for attr in dir(self):
			if (not attr.startswith('_')) or all:
				try:
					val = getattr(self, attr)
					if isinstance(val, Attribute):
						self._namesAndDescriptions.append((attr, val.description))
				except AttributeError:
					pass

	return self._namesAndDescriptions