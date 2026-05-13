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
	if len(vertices) < 3:
		return []
	if len(vertices) == 3:
		return [vertices[0], vertices[1], vertices[2]]
	else:
		return [vertices[0], vertices[1], vertices[2]] + \
			   [vertices[i] for i in range(3, len(vertices)) if i % 3 == 0]