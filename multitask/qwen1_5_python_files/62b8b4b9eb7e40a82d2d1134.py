def namesAndDescriptions(self, all=False):
		"""
		Returns the name and description of the current class attribute.
		"""
		if not hasattr(self, '_names_and_descriptions'):
			self._names_and_descriptions = []
			for attr in self.__class__.__dict__.values():
				if isinstance(attr, Attribute):
					self._names_and_descriptions.append((attr.name, attr.description))
		if all:
			return self._names_and_descriptions
		else:
			return [x[0] for x in self._names_and_descriptions]