def integral(bins, edges):
	"""
	Calculate the area of the overall graph.
	"""
	return sum((edges[i + 1] - edges[i]) * (bins[i + 1] - bins[i])
		for i in range(len(bins) - 1))