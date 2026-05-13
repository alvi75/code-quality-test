def integral(bins, edges):
	"""
	Calculate the area of the overall graph.
	"""
	return np.sum((bins[1:] - bins[:-1]) * (edges[1:] + edges[:-1])/2)