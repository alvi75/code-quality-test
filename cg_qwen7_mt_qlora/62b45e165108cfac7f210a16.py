def validate_as_prior_version(self, prior):
	"""
	Check that prior is a valid prior version of the current inventory object. The input variable prior is also expected to be an InventoryValidator object and both self and prior inventories are assumed to have been checked for internal consistency. Return error() in the class.
	"""

	if not isinstance(prior, InventoryValidator):
		self.error("Prior must be an instance of InventoryValidator")
		return False

	if not prior.is_valid():
		self.error("Prior is invalid")
		return False

	if not self.is_valid():
		self.error("Current inventory is invalid")
		return False

	if not self._is_compatible_with(prior):
		self.error("Incompatible versions: %s vs %s" % (self.version(), prior.version()))
		return False

	if not self._is_compatible_with_current(prior):
		self.error("Incompatible with current inventory")
		return False

	return True