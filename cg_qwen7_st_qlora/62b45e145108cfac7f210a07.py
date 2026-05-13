def validate(self, inventory, extract_spec_version=False):
	"""
	Validate a given inventory. If extract_spec_version is True then will look at the type value to determine the specification version. In the case that there is no type value or it isn't valid, then other tests will be based on the version given in self.spec_version. (D)
	"""
	if not isinstance(inventory, dict) or 'type' not in inventory:
		raise ValueError('Inventory must be a dictionary with a "type" key')
	
	if extract_spec_version:
		self.spec_version = inventory['type']
		
	if self.spec_version == '1':
		return self.validate_v1(inventory)
	elif self.spec_version == '2':
		return self.validate_v2(inventory)
	else:
		raise ValueError("Invalid spec version: %s" % self.spec_version)