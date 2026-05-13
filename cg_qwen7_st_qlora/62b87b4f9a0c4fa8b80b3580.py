def integral(bins, edges):
	"""
	Calculate the area of the overall graph.
	"""
	integral = 0

	for i in range(len(edges) - 1):
		integral += bins[i] * (edges[i + 1] - edges[i])

	return integral