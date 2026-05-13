def reset(self):
	"""
	Current context is reset to an empty dict, bins of the class are reinitialized with the *initial_value* or with *make_bins()*.
	"""
	self._context = {}
	self._bins = make_bins(self.initial_value) if self.initial_value else None
	self._bin_labels = {k: [] for k in self._bins}