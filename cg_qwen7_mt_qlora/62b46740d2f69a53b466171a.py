def pretty(self, indent=0, debug=False):
	"""
	Return a pretty formatted representation of self. obj = f"'{self.obj}'" if isinstance(self.obj, str) else repr(self.obj) return (" " * indent) + f"{self.__class__.__name__}({debug_details}{obj})"
	"""
	return (f"{self.__class__.__name__}(" +
			f"\n{' '*(indent+2)}{self.obj.pretty(indent+4, debug=debug)}\n" +
			f"{' '*indent})")