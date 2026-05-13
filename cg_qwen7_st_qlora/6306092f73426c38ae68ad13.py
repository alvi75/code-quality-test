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
		raise RuntimeError("Playbook path does not exist: %s" %
						   playbook_path)

	playbook = ir_plugin.get_ansible_playbook(playbook_path)
	playbook.set_verbose(verbose=verbose)
	playbook.set_extra_vars(extra_vars=extra_vars)
	playbook.set_ansible_args(ansible_args=ansible_args)

	return playbook.run()