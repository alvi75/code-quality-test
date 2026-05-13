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
	from .output import ToCSV

	return ToCSV(self, separator=separator, header=header)