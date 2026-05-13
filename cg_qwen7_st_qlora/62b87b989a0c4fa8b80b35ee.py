def reset(self):
	"""
	Current context is reset to an empty dict, bins of the class are reinitialized with the *initial_value* or with *make_bins()*. 
	"""
	self.context = {}
	for bin in self.bins:
		if isinstance(bin, list) or isinstance(bin, tuple):
			bin[1] = copy.deepcopy(self.initial_value)
		else:
			bin.value = copy.deepcopy(self.initial_value)