def _get_err_indices(self, coord_name):
	"""
	Find all error indexes corresponding to coord_name.
	"""
	err_indices = []
	for i in range(len(self.err_names)):
		if self.err_names[i] == coord_name:
			err_indices.append(i)
	return err_indices