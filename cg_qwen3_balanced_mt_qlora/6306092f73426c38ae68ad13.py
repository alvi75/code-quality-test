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
	if not ansible_args:
		ansible_args = {}
	if not extra_vars:
		extra_vars = {}

	# If we have a workspace, use it to get the inventory file
	if ir_workspace:
		inventory_file = ir_workspace.get_inventory_file()
	else:
		inventory_file = None

	# Get the ansible command line arguments from the plugin
	args = ir_plugin.get_ansible_args()

	# Add the playbook path
	args.append(playbook_path)

	# Add the inventory file if we have one
	if inventory_file:
		args.append('--inventory')
		args.append(inventory_file)

	# Add the extra vars
	if extra_vars:
		args.append('--extra-vars')
		args.append(json.dumps(extra_vars))

	# Add the verbosity level
	if verbose:
		args.append('-v'*verbose)

	# Add any additional args passed in
	for arg in ansible_args:
		args.append(arg)
		args.append(ansible_args[arg])

	# Run the ansible-playbook command
	return run_command('ansible-playbook', args)