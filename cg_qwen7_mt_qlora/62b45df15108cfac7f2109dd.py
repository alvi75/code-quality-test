def status_str(self, prefix=''):
	"""
	Return string representation with self.log.status_str, with optional prefix.
	"""
	return '\n'.join([prefix + s for s in self.log.status_str().split('\n')])