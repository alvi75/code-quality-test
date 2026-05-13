def _get_err_indices(self, coord_name):
	"""
	def _get_err_indices(self, coord_name):
	"""
	Find all error indexes corresponding to coord_name.
	"""
	err_idx = []
	for i in range(len(self._errors)):
		if self._errors[i].name == coord_name:
			err_idx.append(i)
	return err_idx