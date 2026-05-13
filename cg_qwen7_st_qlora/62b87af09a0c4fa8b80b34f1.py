def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.

Coordinates outside the histogram edges are ignored.
	"""

	if self._is_2d:
		x = int(coord[0] / self._bin_width)
		y = int(coord[1] / self._bin_height)

		if x >= 0 and y >= 0 and x < len(self._data) and y < len(self._data[x]):
			self._data[x][y] += weight

	else:
		x = int(coord[0] / self._bin_width)

		if x >= 0 and x < len(self._data):
			self._data[x] += weight