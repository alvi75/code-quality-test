def data(self, *keys):
	"""
	Returns the keys processed by the transform method of the RecordExporter class.
	"""
		return [self.transform(k) for k in self._data.get(*keys)]