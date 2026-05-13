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

	if not os.path.isfile(playbook_path):
		raise Exception("Playbook file %s does not exist" % playbook_path)

	if not os.access(playbook_path, os.X_OK):
		raise Exception("Playbook file %s is not executable" % playbook_path)

	extra_vars = extra_vars or {}
	# TODO: move this into a template so we can get rid of these ugly string formats
	cmd = ["ansible-playbook", "--remote-user={}".format(
		ir_plugin.remote_user), "--private-key-file={}".format(
		ir_plugin.private_key_file), "-l{}".format(
		ir_plugin.log_level.name.lower()), "-i {}".format(
		ir_plugin.inventory_path), "-e '{}'".format(json.dumps(extra_vars)),
		"--tags='{}'".format(",".join(ansible_args.get('tags', []))),
		"--extra-vars='{}'".format(json.dumps(extra_vars)), playbook_path]

	return subprocess.call(cmd) == 0