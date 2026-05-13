def status_str(self, prefix=''):
	"""
	Return a string with visiting the sorted self.messages list, each visit add prefix and the element in the sorted self.messages list.
	"""
	str = ''
	for msg in sorted(self.messages):
		if isinstance(msg, Message) and msg.type == 'error':
			str += prefix + str(msg)
	return str