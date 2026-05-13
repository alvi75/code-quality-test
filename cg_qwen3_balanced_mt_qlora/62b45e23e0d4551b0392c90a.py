def validate_version_inventories(self, version_dirs):
		"""
		Each version SHOULD have an inventory up to that point.

Also keep a record of any content digests different from those in the root inventory
so that we can also check them when validating the content.

version_dirs is an array of version directory names and is assumed to be in
version sequence (1, 2, 3...).
		"""
		for version_dir in version_dirs:
			version = int(version_dir)
			if version < self.version:
				continue

			inventory_path = os.path.join(self.root_dir, version_dir, 'inventory.json')
			if not os.path.exists(inventory_path):
				raise Exception('Version %s does not have an inventory' % version)

			with open(inventory_path) as f:
				inventory = json.load(f)

			self.validate_inventory(inventory, version)