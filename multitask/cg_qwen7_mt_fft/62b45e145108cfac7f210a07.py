def validate(self, inventory, extract_spec_version=False):
	"""
	Validate a given inventory. If extract_spec_version is True then will look at the type value to determine the specification version. In the case that there is no type value or it isn't valid, then other tests will be based on the version given in self.spec_version. (D)
	"""

	if not isinstance(inventory, dict):
		raise Exception("Inventory must be formatted as a dictionary.")

	self._validate_inventory_structure(inventory)

	if 'type' in inventory:
		version = inventory['type']
	elif extract_spec_version == False:
		version = "1"
	else:
		version = None

	if version == "2":
		return self.validate_v2(inventory)
	else:
		return self.validate_v1(inventory)