def scale(self, other=None, recompute=False):
	"""
	Compute or set scale (integral of the histogram).

If *other* is ``None``, return scale of this histogram.
If its scale was not computed before,
it is computed and stored for subsequent use
(unless explicitly asked to *recompute*).
Note that after changing (filling) the histogram
one must explicitly recompute the scale
if it was computed before.

If a float *other* is provided, rescale self to *other*.

Histograms with scale equal to zero can't be rescaled.
:exc:`.LenaValueError` is raised if one tries to do that.
	"""
	if other is None:
		if hasattr(self, '_scale') and not recompute:
			return self._scale
		self._scale = sum(self.values())
	elif isinstance(other, RealNumbers):
		if self.scale == 0.0:
			raise LenacValueError("Can't rescale histogram with scale=0")
		self.array *= other / self.scale
	else:
		raise TypeError(
			"Scale factor should be either None or real number."
		)
	return self._scale