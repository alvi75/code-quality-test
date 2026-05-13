def namesAndDescriptions(self, all=False):
	"""
	Returns the name and description of the current class attribute.
	"""
	if not self._names:
		self._names = []
		for attr in dir(self.__class__):
			if attr.startswith('_') or attr == 'namesAndDescriptions':
				continue

			try:
				val = getattr(self, attr)
			except AttributeError:
				continue

			if isinstance(val, Attribute):
				self._names.append((attr, val.description))
			elif all:
				self._names.append((attr, None))

	return self._names