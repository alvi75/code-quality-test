def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.

Coordinates outside the histogram edges are ignored.
	"""
	if self._ndim == 0:
	    raise ValueError("Cannot fill zero-dimensional histogram")
	for i in range(len(coord)):
	    if coord[i] < self._xedges[i]:
		raise ValueError("coordinate %s out of bounds" % (i,))
	if len(coord) != self._ndim:
	    raise ValueError("incorrect coordinate length (%d vs %d)" %
		                 (len(coord), self._ndim))
	self._frequencies[coord] += weight
	self._errors2[coord] += weight**2.