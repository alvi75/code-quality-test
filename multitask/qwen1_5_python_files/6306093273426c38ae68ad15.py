def _run_playbook(cli_args, vars_dict, ir_workspace, ir_plugin):
	""" Runs ansible cli with vars dict

:param vars_dict: dict, Will be passed as Ansible extra-vars
:param cli_args: the list  of command line arguments
:param ir_workspace: An Infrared Workspace object represents the active
 workspace
:param ir_plugin: An InfraredPlugin object of the current plugin
:return: ansible results
	"""

	if not isinstance(vars_dict, dict):
		raise ValueError('vars_dict must be a dictionary')

	if not isinstance(ir_plugin, InfraredPlugin):
		raise ValueError('ir_plugin must be an instance of InfraredPlugin')

	if not isinstance(ir_workspace, InfraredWorkspace):
		raise ValueError('ir_workspace must be an instance of InfraredWorkspace')

	# Create playbook context
	context = {
		'inventory': None,
		'cli_args': cli_args,
		'vars_dict': vars_dict,
		'playbook_dir': os.path.dirname(os.path.abspath(__file__)),
		'current_workspace': ir_workspace,
		'current_plugin': ir_plugin,
	}

	# Run playbook
	try:
		result = run_ansible(
			['ansible-playbook', '--extra-vars'] + [u"=".join([k, v]) for k, v in vars_dict.items()],
			ir_plugin.playbooks[ir_plugin.name],
			context=context)
	except SystemExit as e:
		sys.stderr.write(u'\nERROR: {}'.format(e.code))
		sys.exit(e.code)

	return result