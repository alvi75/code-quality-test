def data(self, *keys):
	"""
	Returns the keys processed by the transform method of the RecordExporter class.
	"""
	if not self._data:
		self._data = [self.transform(*k) for k in keys]
	return self._data