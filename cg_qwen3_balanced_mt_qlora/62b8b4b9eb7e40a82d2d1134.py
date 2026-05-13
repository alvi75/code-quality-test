def namesAndDescriptions(self, all=False):
		"""
		Returns the name and description of the current class attribute.
		"""
		if self._namesAndDescriptions is None:
			self._namesAndDescriptions = {}
			for attr in dir(self):
				if not attr.startswith('_'):
					value = getattr(self, attr)
					if isinstance(value, (str, unicode)):
						self._namesAndDescriptions[attr] = value
					elif hasattr(value, '__doc__'):
						self._namesAndDescriptions[attr] = value.__doc__
		return self._namesAndDescriptions.keys() if all else self._namesAndDescriptions