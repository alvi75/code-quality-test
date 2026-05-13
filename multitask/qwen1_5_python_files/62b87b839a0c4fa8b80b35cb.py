def _get_err_indices(self, coord_name):
	"""
	Find all error indexes corresponding to coord_name.
	"""
	err_coords = self._err_coords
	if not isinstance(err_coords, dict):
		raise ValueError("The 'error_coords' attribute must be a dictionary")
	return err_coords.get(coord_name)