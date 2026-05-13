def is_run_el(obj):
	"""
	Check whether the obj class has the run method.
	"""
	if inspect.isclass(obj) or callable(obj):
		return hasattr(obj, "run")
	else:
		raise TypeError("The object passed to taskotronTask.run must be a "
		        "callable (function or class with __call__ defined).")