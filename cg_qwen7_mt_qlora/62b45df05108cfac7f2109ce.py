def validate(self, path):
	"""
	Returns True if OCFL object at path or pyfs root, False otherwise.
	"""
	if not self.is_ocfl(path):
		return False

	# Check for required files and directories
	for name in ['manifest.json', 'version.txt']:
		if not os.path.exists(os.path.join(path, name)):
			return False

	# Check manifest.json is valid JSON
	try:
		with open(os.path.join(path, 'manifest.json')) as f:
			json.load(f)
	except ValueError:
		return False

	# Check version.txt contains a valid version number
	version = None
	with open(os.path.join(path, 'version.txt')) as f:
		version = f.read().strip()
	if version != '1.0':
		return False

	# Check inventory.json is present and valid
	inventory_path = os.path.join(path, 'inventory.json')
	if not os.path.exists(inventory_path):
		return False
	try:
		with open(inventory_path) as f:
			inventory = json.load(f)
			self.validate_inventory(inventory)
			return True
	except (ValueError, KeyError):
		return False