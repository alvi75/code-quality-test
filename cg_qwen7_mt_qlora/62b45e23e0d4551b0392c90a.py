def validate_version_inventories(self, version_dirs):
	"""
	Each version SHOULD have an inventory up to that point.

Also keep a record of any content digests different from those in the root inventory
so that we can also check them when validating the content.

version_dirs is an array of version directory names and is assumed to be in
version sequence (1, 2, 3...).

	"""

	for i, vdir in enumerate(version_dirs):

		if not os.path.exists(os.path.join(vdir, 'inventory.json')):
			self.errors.append("Version %s does not contain an inventory file" % vdir)

		with open(os.path.join(vdir, 'inventory.json')) as f:
			inventory = json.load(f)
			for k,v in inventory.items():
				if k == 'content':
					continue

				if k not in self.root_inventory:
					self.errors.append("Inventory for version %s contains unknown key '%s'" % (vdir, k))

				if v != self.root_inventory[k]:
					self.content_digests_to_check.add(k)