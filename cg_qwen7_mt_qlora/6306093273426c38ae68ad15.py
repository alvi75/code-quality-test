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

	if not isinstance(vars_dict, dict):
		raise TypeError("vars_dict must be a dictionary")

	vars_files = []
	for var in vars_dict:
		var_file_path = os.path.join(ir_workspace.get_dir(), var)
		if not os.path.isfile(var_file_path):
			var_file_path = os.path.join(ir_plugin.get_dir(), var)

		if not os.path.isfile(var_file_path):
			raise ValueError(
				"Variable file {} does not exist".format(var))

		vars_files.append(var_file_path)

	cli_args.extend(["-e", json.dumps(vars_dict)])
	cli_args.extend(["--extra-vars",
	                 " ".join(["@{}".format(f) for f in vars_files])])

	return run_ansible_cli(cli_args)