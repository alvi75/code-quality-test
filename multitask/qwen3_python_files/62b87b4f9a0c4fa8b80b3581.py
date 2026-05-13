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

	if isinstance(other, HistogramBase):
		if self._scale == 0 or other._scale == 0:
			raise LenAValueError("Can't rescale histogram with zero scale")
		self._scale /= other._scale
		self._values = self._values / self._scale
		self._errors2 = self._errors2 / self._scale**2
		self._sum_w2 = self._sum_w2 / self._scale**2
		self._sum_w = self._sum_w / self._scale
		self._sum = self._sum / self._scale
		self._sum2 = self._sum2 / self._scale**2
		self._sum3 = self._sum3 / self._scale**3
		self._sum4 = self._sum4 / self._scale**4
		self._sum_w_err2 = self._sum_w_err2 / self._scale**2
		self._sum2_w_err2 = self._sum2_w_err2 / self._scale**2
		self._sum3_w_err2 = self._sum3_w_err2 / self._scale**2
		self._sum4_w_err2 = self._sum4_w_err2 / self._scale**2
		self._sum_w_err3 = self._sum_w_err3 / self._scale**3
		self._sum2_w_err3 = self._sum2_w_err3 / self._scale**3
		self._sum3_w_err3 = self._sum3_w_err3 / self._scale**3
		self._sum4_w_err3 = self._sum4_w_err3 / self._scale**3
		self._sum_w