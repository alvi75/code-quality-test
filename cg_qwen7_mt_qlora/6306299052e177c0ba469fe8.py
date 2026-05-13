def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Check whether sender_handle is the same as entity_handle. If yes, return True. Otherwise, return False.
	"""

	if not isinstance(entity_handle, EntityHandle):
		raise TypeError("entity_handle must be of type 'EntityHandle'")

	if not isinstance(sender_handle, Handle):
		raise TypeError("sender_handle must be of type 'Handle'")

	return sender_handle == entity_handle.handle