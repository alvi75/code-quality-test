def validate_as_prior_version(self, prior):
	"""
	Check that prior is a valid prior version of the current inventory object. The input variable prior is also expected to be an InventoryValidator object and both self and prior inventories are assumed to have been checked for internal consistency. Return error() in the class.
	"""

	if not isinstance(prior, type(self)):
		raise TypeError("prior must be %s instance" % type(self).__name__)
	for k,v in list(self.items()):
		try:
			prior[k].validate(v)
		except (AttributeError, ValueError) as e:
			self._error = e
			return False
	else:
		return True