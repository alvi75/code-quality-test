def pop(self, key, default=__marker):
	"""
	def pop(self, key, default=__marker):
	"""
	if self._cache is None:
		return super(WeakValueDictionary, self).pop(key, default)
	else:
		try:
			value = self._cache[key]
		except KeyError:
			if default is __marker:
				raise
			return default
		else:
			del self._cache[key]
			return value