def _normalizeargs(sequence, output=None):
	"""
	Normalize declaration arguments

Normalization arguments might contain Declarions, tuples, or single
interfaces.

Anything but individial interfaces or implements specs will be expanded.
	"""
	if not sequence:
		return []
	if isinstance(sequence[0], Interface):
		return [sequence]
	if isinstance(sequence[0], tuple):
		return list(sequence)
	if isinstance(sequence[0], DeclBase):
		return [sequence]
	if isinstance(sequence[0], str):
		return [sequence]
	if isinstance(sequence[0], int):
		return [sequence]
	if isinstance(sequence[0], bool):
		return [sequence]
	if isinstance(sequence[0], float):
		return [sequence]
	if isinstance(sequence[0], bytes):
		return [sequence]
	if isinstance(sequence[0], unicode):
		return [sequence]
	if isinstance(sequence[0], (list,tuple)):
		return [sequence]
	if isinstance(sequence[0], dict):
		return [sequence]
	if isinstance(sequence[0], set):
		return [sequence]
	if isinstance(sequence[0], GeneratorType):
		return [sequence]
	if isinstance(sequence[0], FunctionType):
		return [sequence]
	if isinstance(sequence[0], MethodType):
		return [sequence]
	if isinstance(sequence[0], BuiltinFunctionType):
		return [sequence]
	if isinstance(sequence[0], BuiltinMethodType):
		return [sequence]
	if isinstance(sequence[0], ModuleType):
		return [sequence]
	if isinstance(sequence[0], ClassType):
		return [sequence]
	if isinstance(sequence[0], InstanceType):
		return [sequence]
	if isinstance(sequence[0], UnboundMethodType):
		return [sequence]
	if isinstance(sequence[0], XMethodType):
		return [sequence]
	if isinstance(sequence[0], XAttributeType):
		return [sequence]
	if isinstance(sequence[0], XInterfaceType):
		return [sequence]
	if isinstance(sequence[0], XUnionType):
		return [sequence]
	if isinstance(sequence[0], XStructType):
		return [sequence]
	if isinstance(sequence[0], XTypedefType):
		return [sequence]
	if isinstance(sequence[0], XEnumType):
		return [sequence]
	if isinstance(sequence[0], XBitfieldType):
		return [sequence]
	if isinstance(sequence[0], XExceptionType):
		return [sequence]
	if isinstance(sequence[0], XConstType):
		return [sequence]
	if isinstance(sequence[0], XVolatileType):
		return [sequence]