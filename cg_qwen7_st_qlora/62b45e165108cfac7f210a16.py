def validate_as_prior_version(self, prior):
	"""
	Check that prior is a valid prior version of the current inventory object. The input variable prior is also expected to be an InventoryValidator object and both self and prior inventories are assumed to have been checked for internal consistency. Return error() in the class.
	"""
	if not isinstance(prior,InventoryValidator):
		self.error("Prior must be an instance of InventoryValidator")
		return False

	if not self.is_valid():
		self.error("Current inventory is invalid")
		return False

	if not prior.is_valid():
		self.error("Prior inventory is invalid")
		return False

	if self.version != prior.version + 1:
		self.error("Version mismatch: Current version %d, prior version %d" %(self.version,prior.version))
		return False

	for key in self._data.keys():
		if key not in prior._data:
			self.error("Key '%s' missing from prior inventory" %key)
			return False
		if type(self._data[key]) != type(prior._data[key]):
			self.error("Type mismatch for key '%s': Current type %s, prior type %s" %(key,type(self._data[key]),type(prior._data[key])))
			return False
		if len(self._data[key]) != len(prior._data[key]):
			self.error("Length mismatch for key '%s': Current length %d, prior length %d" %(key,len(self._data[key]),len(prior._data[key])))
			return False
		for i in range(len(self._data[key])):
			if self._data[key][i] != prior._data[key][i]:
				self.error("Value mismatch for key '%s', index %d: Current value %s, prior value %s" %(key,i,self._data[key][i],prior._data[key][i]))
				return False

	return True