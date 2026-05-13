def namesAndDescriptions(self, all=False):
	"""
	Returns the name and description of the current class attribute.
	"""
	if not self._namesAndDescriptions:
		self._namesAndDescriptions = [self.name]
		for attr in dir(self):
			attrValue = getattr(self, attr)
			if (attrValue is None) or (isinstance(attrValue, str) and len(attrValue) == 0):
				continue
			elif isinstance(attrValue, list):
				continue
			elif isinstance(attrValue, dict):
				continue
			elif hasattr(attrValue, '__name__'):
				self._namesAndDescriptions.append(attrValue.__name__)
			else:
				self._namesAndDescriptions.append(attr)
	return self._namesAndDescriptions