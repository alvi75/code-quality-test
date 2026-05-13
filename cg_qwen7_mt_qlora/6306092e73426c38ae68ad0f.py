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

	control_args = {}
	nested_args = {}

	for arg in args:
		if arg.startswith('--'):
			arg_name = arg[2:]
			if arg_name in self.control_arguments:
				control_args[arg_name] = True
			else:
				raise ValueError("Unknown control argument %s" % arg_name)
		elif '=' in arg:
			kv = arg.split('=', 1)
			if kv[0].startswith('-') or kv[0].startswith('--'):
				kv[0] = kv[0][1:]
			if kv[0] in self.nested_arguments:
				nested_args[kv[0]] = kv[1]
			else:
				raise ValueError("Unknown nested argument %s" % kv[0])
		else:
			nested_args[arg] = None

	return control_args, nested_args