def _replace_register(flow_params, register_number, register_value):
	"""
	Replace the value of flow_params[register_number] with flow_params[register_value] and delete flow_params[register_value]
	"""
	if register_number in flow_params:
		del flow_params[register_number]
	else:
		raise ValueError("Flow parameter %s not found" % (register_number,))
	flow_params[register_number] = register_value