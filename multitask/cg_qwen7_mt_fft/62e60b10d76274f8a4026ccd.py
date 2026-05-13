def data(self, *keys):
		"""
		Returns the keys processed by the transform method of the RecordExporter class.
		"""
		if len(keys) == 0:
			return self._data

		result = {}
		for key in keys:
			if not isinstance(key, str):
				raise TypeError("Key must be a string.")

			if key in self._data.keys():
				result[key] = self._data[key]

		return result