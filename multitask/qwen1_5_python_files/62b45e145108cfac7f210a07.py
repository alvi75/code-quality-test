def validate(self, inventory, extract_spec_version=False):
	"""
	Validate a given inventory. If extract_spec_version is True then will look at the type value to determine the specification version. In the case that there is no type value or it isn't valid, then other tests will be based on the version given in self.spec_version. (D)
	"""
		spec = None

		if not extract_spec_version:
			spec = self.get_inventory_spec(inventory)

		for host in inventory.list_hosts():
			self.validate_host(host, spec)