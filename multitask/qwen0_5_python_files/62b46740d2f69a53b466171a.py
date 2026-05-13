def pretty(self, indent=0, debug=False):
	"""
	Return a pretty formatted representation of self. obj = f"'{self.obj}'" if isinstance(self.obj, str) else repr(self.obj) return (" " * indent) + f"{self.__class__.__name__}({debug_details}{obj})"
	"""
	if not debug:
		return f"{self.__class__.__name__}({indent})"
	else:
		return f"{self.__class__.__name__}({indent})\n{self._repr_debug()}"