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

	if not isinstance(get_coordinate, str):
		get_coordinate = get_coordinate.__name__

	if make_value is None:
		make_value = _identity

	if hasattr(make_value, "__call__"):
		def make_value(x): return x[0]

	if len(field_names) != 1 or field_names[0] == "value":
		field_names = ("x", "y")

	if scale is True:
		scale = hist.GetBinWidth(0)

	if get_coordinate in ["left", "first"]:
		x = [hist.GetBinLeftEdge(i + 1) for i in range(hist.GetNbinsX())]
	elif get_coordinate in ["right", "last"]:
		x = [hist.GetBinRightEdge(i + 1) for i in range(hist.GetNbinsX())]
	else:
		x = [
			hist.GetBinCenter(i + 1) for i in range(hist.GetNbinsX())
		]

	y = [_f(y) for y in map(make_value, hist)]

	return Graph(
		list(zip(x