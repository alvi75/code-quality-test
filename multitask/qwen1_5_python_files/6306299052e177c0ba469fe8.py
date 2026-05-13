def check_sender_and_entity_handle_match(sender_handle, entity_handle):
	"""
	Check whether sender_handle is the same as entity_handle. If yes, return True. Otherwise, return False.
	"""
	if sender_handle == entity_handle:
		return True

	sender_handle = str(sender_handle)
	entity_handle = str(entity_handle)

	if len(sender_handle) > 0 and len(entity_handle) > 0:
		if sender_handle[0] != entity_handle[0]:
			return False

		for i in range(1, min(len(sender_handle), len(entity_handle))):
			if not (sender_handle[i].isalpha() and entity_handle[i].isalpha()):
				return False

			if sender_handle[i].isdigit():
				continue

			if sender_handle[i] != entity_handle[i]:
				return False

		return True

	return False