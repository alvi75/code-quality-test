def integral(bins, edges):
	"""
	Calculate the area of the overall graph.
	"""
	if len(edges) != 2:
		raise ValueError("edges must be a list with two elements")
	return np.sum(np.diff(edges[0]) * bins)