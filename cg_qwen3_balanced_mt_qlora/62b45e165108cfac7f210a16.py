def validate_as_prior_version(self, prior):
	"""
	Check that prior is a valid prior version of the current inventory object. The input variable prior is also expected to be an InventoryValidator object and both self and prior inventories are assumed to have been checked for internal consistency. Return error() in the class.
	"""
	if not isinstance(prior, InventoryValidator):
		return self.error('prior must be an InventoryValidator object')
	
	if not self._validate_as_prior_version(prior):
		return prior.error('prior does not match this inventory')