def reset(self):
	"""
	Current context is reset to an empty dict, bins of the class are reinitialized with the *initial_value* or with *make_bins()*.
	"""
	self.__dict__ = {}
	self._context = Context()
	self.make_bins()