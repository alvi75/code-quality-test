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

	if not isinstance(hist, Histogram):
		raise TypeError(
			"Expected a histogram, got %s." % type(hist).__name__)

	if len(field_names) != hist.dimension:
		raise ValueError(
			"Number of field names (%d) does not match "
			"dimension of the histogram (%d)."
			% (len(field_names), hist.dimension))

	if make_value is None:
		make_value = lambda x: x.content

	if get_coordinate == "left":
		get_coordinate = lambda x: x.left
	elif get_coordinate == "right":
		get_coordinate = lambda x: x.right
	elif get_coordinate == "middle":
		get_coordinate = lambda x: x.middle
	else:
		raise ValueError(
			"Unknown coordinate '%s' for histograms."
			% get_coordinate)

	graph = Graph(hist.dimension, name=hist.name,
	              title=hist.title, scale=scale)

	for i in range(len(hist)):
		point = [getattr(get_coordinate(hist[i]), f) for f in field_names]
		graph