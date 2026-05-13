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
	if not make_value:
		make_value = lambda x: x

	if not isinstance(make_value, collections.Callable):
		raise TypeError("make_value must be callable")

	if not isinstance(get_coordinate, str):
		raise TypeError("get_coordinate must be string")

	if not isinstance(field_names, collections.Iterable):
		raise TypeError("field_names must be iterable")

	if len(field_names) != hist.dim():
		raise ValueError("len(field_names) must be equal to hist.dim()")

	if scale is None:
		scale = hist.scale()

	if scale == "unknown":
		scale = None

	graph = Graph()
	for i in range(hist.nbins()):
		bin_ = hist.bin(i)
		value = make_value(bin_)
		if not isinstance(value, collections.Iterable):
			value = (value,)
		if get_coordinate == "left":
			x = bin_.left
		elif get_coordinate == "right":
			x = bin_.right
		else:
			x = bin_.middle
		y = value[0]
		if len(value)