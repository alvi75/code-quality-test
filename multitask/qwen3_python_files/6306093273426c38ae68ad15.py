def _run_playbook(cli_args, vars_dict, ir_workspace, ir_plugin):
	"""
	defines a playbook to run against the hosts in the workspace
	and returns the results

	:param vars_dict: dict, Will be passed as Ansible extra-vars
	:param cli_args: the list  of command line arguments
	:param ir_workspace: An Infrared Workspace object represents the active
	workspace
	:param ir_plugin: An InfraredPlugin object of the current plugin
	:return: ansible results
	"""
	# create a temporary directory for the playbook
	temp_dir = tempfile.mkdtemp()
	# create a playbook file
	ir_plugin.create_ansible_playbook(ir_workspace, temp_dir)
	# run the playbook
	return _run_ansible_playbook(vars_dict, cli_args, temp_dir)