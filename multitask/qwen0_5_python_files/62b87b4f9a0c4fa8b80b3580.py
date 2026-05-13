def integral(bins, edges):
	"""
	Calculate the area of the overall graph.
	"""
	return sum([np.prod(np.diff(edges[i+1])) for i in range(len(edges)-1)])