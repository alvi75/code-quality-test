def get(self, key, default=None):
	"""
	If a key exists in the class, the value corresponding to the key is returned. Otherwise, default is returned.
	"""
	if hasattr(self, "_config"):
		 return self._config.get(key, default)
	else:
		 return getattr(self, key, default)