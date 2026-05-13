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
	# TODO: add support for nested and control args

	# Control args
	control_args = {}
	for arg in args:
		if arg.startswith("--"):
			arg = arg[2:]
		elif arg.startswith("-"):
			arg = arg[1:]
		else:
			continue
		if "=" in arg:
			key, value = arg.split("=", 1)
			key = key.strip()
			value = value.strip()
			if key == "control":
				control_args[key] = value
			elif key == "nested":
				nested_args = self.get_nested_custom_and_control_args(value)
				control_args.update(nested_args)
			elif key == "control-nested":
				nested_args = self.get_nested_custom_and_control_args(value)
				nested_args["control"] = control_args
				control_args.update(nested_args)
			else:
				continue
		else:
			continue
	return control_args, nested_args