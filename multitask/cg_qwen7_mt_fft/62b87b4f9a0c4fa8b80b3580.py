def integral(bins, edges):
	"""
	Calculate the area of the overall graph.
	"""
	bins = np.asarray(bins)
	edges = np.asarray(edges)

	if bins.shape[0] != (edges.shape[0]-1):
		raise RuntimeError("The number of bins does not match the number \
of edges")

	integral = 0.0
	for i in range(0,bins.shape[0]):
		integral += _trapezoid_integration(bins[i], edges[i:i+2])
	return integral