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
		raise Exception("vars must be a dictionary")

	# create temporary directory to hold all playbook files including any template rendered by
	# pre tasks.
	temp_dir = tempfile.mkdtemp()

	# copy playbook over so it's accessible from within temp dir
	shutil.copyfile(cli_args.playbook_file, os.path.join(temp_dir, 'main.yml'))

	# copy supporting files (roles, handlers etc) over if they exist in the playbooks path
	if os.path.isdir(os.path.join(cli_args.playbook_directory, 'files')):
		shutil.copytree(
			os.path.join(cli_args.playbook_directory, 'files'),
			os.path.join(temp_dir, 'files')
		)

	if os.path.isdir(os.path.join(cli_args.playbook_directory, 'handlers')):
		shutil.copytree(
			os.path.join(cli_args.playbook_directory, 'handlers'),
			os.path.join(temp_dir, 'handlers')
		)

	if os.path.isdir(os.path.join(cli_args.playbook_directory, 'tasks')):
		shutil.copytree(
			os.path.join(cli_args.playbook_directory, 'tasks'),
			os.path.join(temp_dir, 'tasks')
		)

	if os.path.isdir(os.path.join(cli_args.playbook_directory, 'templates')):
		shutil.copytree(
			os.path.join(cli_args.playbook_directory, 'templates'),
			os.path.join(temp_dir, 'templates')
		)

	if os.path.isdir(os.path.join(cli_args.playbook_directory, 'vars')):
		shutil.copytree(
			os.path.join(cli_args.playbook_directory, 'vars'),
			os.path.join(temp_dir, 'vars')
		)

	# render any jinja templates using input_vars against each other
	ir_plugin.render_templates(vars_dict=vars_dict,
							   target_path=temp_dir)

	# run the playbook
	return_code = subprocess.call(['ansible-playbook',
								   '-i', os.path.join(temp_dir, 'hosts'),
								   '--tags', ','.join(cli_args.tags),
								   '--extra-vars', json.dumps(vars_dict),