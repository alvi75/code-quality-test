def _run_playbook(cli_args, vars_dict, ir_workspace, ir_plugin):
	"""
	Runs ansible cli with vars dict

:param vars_dict: dict, Will be passed as Ansible extra-vars
:param cli_args: the list  of command line arguments
:param ir_workspace: An Infrared Workspace object represents the active
 workspace
:param ir_plugin: An InfraredPlugin object of the current plugin
:return: ansible results
	"""

	cli_args = [str(arg) for arg in cli_args]
	vars_str = json.dumps(vars_dict)
	if not os.path.exists(ir_workspace.workspace_path):
		os.makedirs(ir_workspace.workspace_path)

	playbook_path = ir_plugin.playbook_path
	if playbook_path is None:
		raise RuntimeError("Playbook path was not set")

	return run_ansible(playbook_path,
	                   args=cli_args,
	                   vars_str=vars_str,
	                   workspace_dir=ir_workspace.workspace_path)