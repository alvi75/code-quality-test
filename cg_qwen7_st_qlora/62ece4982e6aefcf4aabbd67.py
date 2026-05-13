def vertex3tuple(vertices):
	"""
	Get 3 points for each vertex of the polygon.
    This will include the vertex and the 2 points on both sides of the vertex
    If the subscript is out of bounds, take the value of index as 0
    Args:
        vertices: vertices to be converted

    Returns:
        A list where the elements of vertices represented by tuple
	"""

	vertex = []
	for i in range(len(vertices)):
		if i == len(vertices) - 1:
			v1 = vertices[i]
			v2 = vertices[0]
			v3 = vertices[1]
		elif i == len(vertices) - 2:
			v1 = vertices[i]
			v2 = vertices[i + 1]
			v3 = vertices[0]
		else:
			v1 = vertices[i]
			v2 = vertices[i + 1]
			v3 = vertices[i + 2]

		vertex.append((v1, v2, v3))

	return vertex