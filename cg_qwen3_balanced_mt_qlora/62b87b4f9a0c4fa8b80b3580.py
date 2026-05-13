def integral(bins, edges):
	"""
	Calculate the area of the overall graph.
	"""
	return np.sum(np.diff(edges) * bins)