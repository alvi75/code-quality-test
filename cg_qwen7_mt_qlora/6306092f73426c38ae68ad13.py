def ansible_playbook(ir_workspace, ir_plugin, playbook_path, verbose=None,
                     extra_vars=None, ansible_args=None):
	"""
	Wraps the 'ansible-playbook' CLI.

:param ir_workspace: An Infrared Workspace object represents the active
workspace
:param ir_plugin: An InfraredPlugin object of the current plugin
:param playbook_path: the playbook to invoke
:param verbose: Ansible verbosity level
:param extra_vars: dict. Passed to Ansible as extra-vars
:param ansible_args: dict of ansible-playbook arguments to plumb down
    directly to Ansible.
	"""

	if not os.path.exists(playbook_path):
		raise RuntimeError("Playbook path %s does not exist" %
		                   playbook_path)

	extra_vars = extra_vars or {}
	ansible_args = ansible_args or {}

	# TODO(tonytan4ever): remove this once we have a proper way to get
	# the inventory file from the workspace
	inventory_file = ir_workspace.get_inventory_file()
	if not inventory_file:
		raise RuntimeError("Inventory file is missing")

	# TODO(tonytan4ever): remove this once we have a proper way to get
	# the host pattern from the workspace
	host_pattern = ir_workspace.get_host_pattern()

	# TODO(tonytan4ever): remove this once we have a proper way to get
	# the remote user from the workspace
	remote_user = ir_workspace.get_remote_user()

	# TODO(tonytan4ever): remove this once we have a proper way to get
	# the ssh key from the workspace
	ssh_key = ir_workspace.get_ssh_key()

	# TODO(tonytan4ever): remove this once we have a proper way to get
	# the ssh port from the workspace
	ssh_port = ir_workspace.get_ssh_port()

	# TODO(tonytan4ever): remove this once we have a proper way to get
	# the ssh password from the workspace
	ssh_password = ir_workspace.get_ssh_password()

	# TODO(tonytan4ever): remove this once we have a proper way to get
	# the ssh private key passphrase from the workspace
	ssh_private_key_passphrase = ir_workspace.get_ssh_private_key_passphrase()

	# TODO(tonytan4ever): remove this once we have a proper way to get
	# the ssh config file from the workspace
	ssh_config_file = ir_workspace.get_ssh_config_file()

	# TODO