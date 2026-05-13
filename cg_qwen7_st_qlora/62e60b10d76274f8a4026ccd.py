def data(self, *keys):
	"""
	Returns the keys processed by the transform method of the RecordExporter class.
	"""
	if len(keys) == 0:
		return self._data.keys()
	else:
		return [self._data[k] for k in keys if k in self._data]