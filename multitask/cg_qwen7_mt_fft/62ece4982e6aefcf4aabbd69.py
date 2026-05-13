def _replace_register(flow_params, register_number, register_value):
	"""
	Replace the value of flow_params[register_number] with flow_params[register_value] and delete flow_params[register_value]
	"""
	if isinstance(register_value, int) or isinstance(register_value, float):
		flow_params[register_number] = register_value
	elif isinstance(register_value, str):
		if ":" in register_value:
			register_name, replace_with = tuple(register_value.split(":"))
			if not (register_name.startswith("$") and replace_with.isdigit()):
				raise ValueError("Invalid dynamic parameter: " + register_value)
			else:
				if register_name in flow_params:
					flow_params[register_number] = flow_params[register_name]
				else:
					raise KeyError("Register $%s is undefined" % register_name)

			del flow_params[register_name]

	return flow_params