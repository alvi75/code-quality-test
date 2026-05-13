def _replace_register(flow_params, register_number, register_value):
	"""
	Replace the value of flow_params[register_number] with flow_params[register_value] and delete flow_params[register_value]
	"""
	if isinstance(register_number, int) and isinstance(register_value, int):
		flow_params[register_number] = flow_params.pop(register_value)
	else:
		raise TypeError("Both register_number and register_value must be integers")