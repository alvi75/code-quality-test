def status_str(self, prefix=''):
	"""
	Return string representation with self.log.status_str, with optional prefix.
	"""
	return '%s%s' % (prefix + self.log.status_str, '\n' if self.log.status_str else '')