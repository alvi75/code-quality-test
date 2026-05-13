def status_str(self, prefix=''):
	"""
	Return a string with visiting the sorted self.messages list, each visit add prefix and the element in the sorted self.messages list.
	"""
	s = ''
	for m in sorted(self.messages):
		s += prefix + str(m) + '\n'
	return s