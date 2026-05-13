def hist_to_graph(hist, make_value=None, get_coordinate="left",
                 field_names=("x", "y"), scale=None):
	"""
	Convert a :class:`.histogram` to a :class:`.graph`.

*make_value* is a function to set the value of a graph's point.
By default it is bin content.
*make_value* accepts a single value (bin content) without context.

This option could be used to create graph's error bars.
For example, to create a graph with errors
from a histogram where bins contain
a named tuple with fields *mean*, *mean_error* and a context
one could use

>>> make_value = lambda bin_: (bin_.mean, bin_.mean_error)

*get_coordinate* defines what the coordinate
of a graph point created from a histogram bin will be.
It can be "left" (default), "right" and "middle".

*field_names* set field names of the graph. Their number
must be the same as the dimension of the result.
For a *make_value* above they would be
*("x", "y_mean", "y_mean_error")*.

*scale* becomes the graph's scale (unknown by default).
If it is ``True``, it uses the histogram scale.

*hist* must contain only numeric bins (without context)
or *make_value* must remove context when creating a numeric graph.

Return the resulting graph.
	"""

	if not isinstance(hist, histogram):
		raise TypeError(
			"Expected a histogram, got %s." % type(hist).__name__)

	if len(field_names) != hist.dimension:
		raise ValueError(
			"Number of field names (%d) does not match "
			"dimension of histogram (%d)."
			% (len(field_names), hist.dimension))

	if make_value is None:
		make_value = lambda bin: bin.content

	graph = graph()
	graph.scale = scale if scale else hist.scale

	for i in range(len(hist)):
		bin_ = hist[i]
		value = make_value(bin_)
		if isinstance(value, collections.Iterable):
			if len(value) != len(field_names):
				raise ValueError(
					"Value returned by make_value has wrong length.")
			graph.append(tuple(getattr(bin_, get_coordinate)), value)
		else:
			graph.append(tuple(getattr(bin_, get_coordinate)), (value,))
	return graph