def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Check whether sender_handle is the same as entity_handle. If yes, return True. Otherwise, return False.
	"""
	if not handle.is_valid_sender(sender_handle):
		return False

	sender_domain = handle.get_domain_from_handle(sender_handle)
	entity_domain = handle.get_domain_from_handle(entity_handle)

	return (sender_domain == entity_domain)