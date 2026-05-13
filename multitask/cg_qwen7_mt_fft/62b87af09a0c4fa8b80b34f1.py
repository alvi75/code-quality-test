def fill(self, coord, weight=1):
	"""
	Fill histogram at *coord* with the given *weight*.

Coordinates outside the histogram edges are ignored.
	"""
	if self._dimension == 2:
	    xbin = int((coord[0] - self._xlim[0])/self._binsize)
	    ybin = int((coord[1] - self._ylim[0])/self._binsize)

	    if (xbin >= 0) and (xbin < self._nx) and \
	       (ybin >= 0) and (ybin < self._ny):
		self._h2data[ybin][xbin] += weight

	elif self._dimension == 3:
	    xbin = int((coord[0] - self._xlim[0])/self._binsize)
	    ybin = int((coord[1] - self._ylim[0])/self._binsize)
	    zbin = int((coord[2] - self._zlim[0])/self._binsize)

	    if (xbin >= 0) and (xbin < self._nx) and \
	       (ybin >= 0) and (ybin < self._ny) and \
	       (zbin >= 0) and (zbin < self._nz):
		self._h3data[zbin][ybin][xbin] += weight