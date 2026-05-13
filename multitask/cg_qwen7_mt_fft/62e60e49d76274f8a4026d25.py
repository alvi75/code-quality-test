def unit_of_work(metadata=None, timeout=None):
	"""
	Returns a decorator with metadata and timeout attributes.
	"""

	def wrap(f):

		if not hasattr(f, "unit_of_work_metadata"):
			f.unit_of_work_metadata = {}

		if metadata:
			f.unit_of_work_metadata.update(metadata)

		if timeout is not None:
			f.unit_of_work_metadata["timeout"] = timeout

		return f

	return wrap