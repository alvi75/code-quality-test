def validate(self, inventory, extract_spec_version=False):
	"""
	Validate a given inventory. If extract_spec_version is True then will look at the type value to determine the specification version. In the case that there is no type value or it isn't valid, then other tests will be based on the version given in self.spec_version. (D)
	"""
	if not isinstance(inventory, dict):
		raise ValueError("Inventory must be a dictionary")
	if 'type' not in inventory:
		raise ValueError("Inventory must have a type key")
	if 'version' not in inventory:
		raise ValueError("Inventory must have a version key")

	version = inventory['version']
	spec_version = self.spec_version

	if extract_spec_version:
		spec_version = inventory['type']

	if spec_version == 'v1':
		if version != 'v1':
			raise ValueError("Inventory must be of version v1")
	elif spec_version == 'v2':
		if version != 'v2':
			raise ValueError("Inventory must be of version v2")
	else:
		raise ValueError("Invalid spec version")