def make_array(shape, dtype=np.dtype("float32")):
	"""
	Returns a 0-filled array of the given shape and type.

        Args:
                shape : tuple
                    shape of the array to create
                dtype : `numpy.dtype`
                    data-type of the array to create
        Return: array
	"""
	return np.zeros(shape=shape, dtype=dtype)