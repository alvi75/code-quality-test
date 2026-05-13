def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.

Coordinates outside the histogram edges are ignored.
	"""
	if not self._is_inside_bounds(coord):
	    return

	self._counts[coord] += weight