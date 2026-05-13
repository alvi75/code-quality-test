def validate(self, inventory, extract_spec_version=False):
	"""
	Validate a given inventory. If extract_spec_version is True then will look at the type value to determine the specification version. In the case that there is no type value or it isn't valid, then other tests will be based on the version given in self.spec_version. (D)
	"""
	if not isinstance(inventory, dict):
		raise TypeError("Inventory must be of type 'dict'")

	if "type" in inventory:
		self.spec_version = inventory["type"]
		del inventory["type"]

	if extract_spec_version:
		try:
			self.spec_version = SpecVersion.from_string(self.spec_version).value
		except ValueError as e:
			raise ValueError("Invalid spec version: %s" % str(e))

	if self.spec_version == 1:
		return self._validate_v1(inventory)

	elif self.spec_version == 2:
		return self._validate_v2(inventory)