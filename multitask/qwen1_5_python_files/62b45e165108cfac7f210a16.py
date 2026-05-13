def validate_as_prior_version(self, prior):
	"""
	Check that prior is a valid prior version of the current inventory object. The input variable prior is also expected to be an InventoryValidator object and both self and prior inventories are assumed to have been checked for internal consistency. Return error() in the class.
	"""
	if not isinstance(prior, self.__class__):
		return self.error("Prior must be of type {}".format(self.__class__.__name__))
	for k,v in self.items():
		if k not in prior:
			return self.error("{} not found in prior".format(k))
		elif v != prior[k]:
			return self.error("{} has different value in prior".format(k))