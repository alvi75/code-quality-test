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
		return self._scale

	elif isinstance(other, Number):
		if other == 0:
			raise LenasValueError("Can't scale by zero")
		else:
			return self._scale / other

	elif isinstance(other, HistogramBase):
		if len(self) != len(other):
			raise ValueError('histograms have different lengths')
		return sum([a/b for a,b in zip(self.values, other.values)]) / other.total

	else:
		raise TypeError('unsupported type')