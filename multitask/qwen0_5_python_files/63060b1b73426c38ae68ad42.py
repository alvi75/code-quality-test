def inject_config(self):
	"""
	If the ANSIBLE_CONFIG property does not exist in os.environ, set it to self.ansible_config_path.
	"""
	if 'ANSIBLE_CONFIG' not in os.environ:
		os.environ['ANSIBLE_CONFIG'] = self.ansible_config_path