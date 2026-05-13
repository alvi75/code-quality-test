def _get_err_indices(self, coord_name):
	"""
	Find all error indexes corresponding to coord_name.
	"""
	for i in range(len(self._errors)):
		if self._errors[i].coord == coord_name:
			yield i