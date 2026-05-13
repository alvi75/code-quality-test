def to_csv(self, separator=",", header=None):
	"""
	.. deprecated:: 0.5 in Lena 0.5 to_csv is not used.
      Iterables are converted to tables.

Convert graph's points to CSV.

*separator* delimits values, the default is comma.

*header*, if not ``None``, is the first string of the output
(new line is added automatically).

Since a graph can be multidimensional,
for each point first its coordinate is converted to string
(separated by *separator*), then each part of its value.

To convert :class:`Graph` to CSV inside a Lena sequence,
use :class:`lena.output.ToCSV`.
	"""
	if self._is_multidimensional:
		if header is None:
			header = [self._get_coordinate_name(i) for i in range(len(self._dimension_names))]
		for row in zip(*[self._points[i] for i in range(len(self._dimension_names))]):
			print(separator.join([str(v) for v in row]), file=sys.stdout)
	else:
		if header is None:
			header = ["x"]
		for row in self._points:
			print(header[0], row, file=sys.stdout)