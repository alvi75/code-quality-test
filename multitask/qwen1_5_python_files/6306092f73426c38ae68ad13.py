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
		raise Exception("Ansible playbook does not exist: %s" %
					 (playbook_path))

	# TODO: Add support for multiple playbooks per role

	# Create a temporary directory to store the playbook results
	temp_dir = tempfile.mkdtemp()
	try:
		# Copy the playbook into the temp dir
		shutil.copyfile(playbook_path, os.path.join(temp_dir, "main.yml"))

		# Run the playbook in the temp dir
		result = _run_ansible(
			ir_workspace=ir_workspace,
			ir_plugin=ir_plugin,
			temp_dir=temp_dir,
			verbose=verbose,
			extra_vars=extra_vars,
			ansible_args=ansible_args)

	except Exception as e:
		# Clean up the playbook copy
		shutil.rmtree(temp_dir)
		raise e

	finally:
		# Clean up the playbook copy
		shutil.rmtree(temp_dir)