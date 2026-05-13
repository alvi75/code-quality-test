def _get_err_indices(self, coord_name):
	"""
	Find all error indexes corresponding to coord_name.
	"""
	if not self._has_errors:
		return []
	err_names = [name for name in self.names if name.startswith(coord_name)]
	return [self.names.index(name) for name in err_names]