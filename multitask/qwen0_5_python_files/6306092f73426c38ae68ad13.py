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
		raise Exception("Playbook path does not exist")
	if not os.path.isfile(playbook_path):
		raise Exception("Playbook file is not a regular file")

	# Create the directory structure for the playbook
	os.makedirs(os.path.dirname(playbook_path))
	os.makedirs(os.path.join(os.path.dirname(playbook_path), "templates"))
	os.makedirs(os.path.join(os.path.dirname(playbook_path), "templates",
							   "inventory"))

	# Copy the template files into place
	for f in [os.path.join(os.path.dirname(__file__), "templates", x)
			for x in ["inventory", "grouping", "hosts", "roles"]]:
		shutil.copy(f, os.path.join(os.path.dirname(playbook_path),
									  "templates", x))

	# Set up the environment variables
	os.environ["INKSCAPE_HOME"] = os.path.join(os.path.dirname(
		os.path.abspath(inspect.getfile(inspect.currentframe()))), "..")
	os.environ["INKSCAPE_HOME"] = os.path.join(os.environ["INKSCAPE_HOME"],
												   "inkscapes")
	os.environ["INKSCAPE_HOME"] = os.path.join(os.environ["INKSCAPE_HOME"],
												   "inkscapes")
	os.environ["INKSCAPE_HOME"] = os.path.join(os.environ["INKSCAPE_HOME"],
												   "inkscapes")
	os.environ["INKSCAPE_HOME"] = os.path.join(os.environ["INKSCAPE_HOME"],
												   "inkscapes")
	os.environ["INKSCAPE_HOME"] = os.path.join(os.environ["INKSCAPE_HOME"],
												   "inkscapes")
	os.environ["INKSCAPE_HOME"] = os.path.join(os.environ["INKSCAPE_HOME"],
												   "inkscapes")
	os.environ["INKSCAPE_HOME"] = os.path.join(os