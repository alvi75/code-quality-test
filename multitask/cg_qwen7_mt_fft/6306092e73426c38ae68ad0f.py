def get_nested_custom_and_control_args(self, args):
	"""
	Split input arguments to control nested and custom.

Controls arguments: control the IR behavior. These arguments
    will not be put into the spec yml file
Nested arguments: are used by the Ansible playbooks and will be put
    into the spec yml file.
Custom arguments: Custom ansible variables to be used instead of the
    normal nested usage.

:param args: the collected list of args.
:return: (dict, dict): flat dicts (control_args, nested_args)
	"""
	nested = {}
	control = {}

	for arg in args:
		if self.is_nested_arg(arg) is True:
			nested.update(self.get_nested_from_string(arg))
		elif self.is_control_arg(arg) is True:
			control.update(self.get_controls_from_string(arg))

	return (control, nested)