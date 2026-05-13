def scale(self, other=None):
	"""
	Get or set the scale of the graph.

If *other* is ``None``, return the scale of this graph.

If a numeric *other* is provided, rescale to that value.
If the graph has unknown or zero scale,
rescaling that will raise :exc:`~.LenaValueError`.

To get meaningful results, graph's fields are used.
Only the last coordinate is rescaled.
For example, if the graph has *x* and *y* coordinates,
then *y* will be rescaled, and for a 3-dimensional graph
*z* will be rescaled.
All errors are rescaled together with their coordinate.
	"""
	if other is None:
		return self._scale
	elif isinstance(other, (int, float)):
		if not self._scale:
			raise ValueError('Cannot rescale graph with no known scale')
		self._scale = other
	else:
		raise TypeError('Scale must be int or float')