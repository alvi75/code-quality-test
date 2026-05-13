def data(self, *keys):
	"""
	Returns the keys processed by the transform method of the RecordExporter class.
	"""
	if not self._data:
		self._data = self.transform(*keys)
	return self._data