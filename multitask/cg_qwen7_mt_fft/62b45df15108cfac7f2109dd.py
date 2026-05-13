def status_str(self, prefix=''):
	"""
	Return string representation with self.log.status_str, with optional prefix.
	"""
	return '{}{}: {}'.format(prefix, self.name,
			self.log.status_str())