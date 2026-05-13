def names(self, all=False):
	"""
	Return the attribute names of current class.
	"""
	if not self._class:
		return []
	classnames = [self._class.__name__]
	if isinstance(self._class, type) else []
	for base in inspect.getmro(self._class):
		if hasattr(base, '__bases__') and \
				issubclass(base, self._class) and \
				base is not self._class:
			classnames.append(base.__name__)
	elif hasattr(base, '__name__'):
		classnames.append(base.__name__)

	names = set()
	for classname in classnames:
		for name in dir(self._class):
			if (not all) or (classname == self._class.__name__) or (
					name.startswith(classname + '_')):
				names.add(name)
	return list(names)