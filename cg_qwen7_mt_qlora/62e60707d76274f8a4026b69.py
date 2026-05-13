def point_type(name, fields, srid_map):
	"""
	Dynamically Generating Point Class
	"""

	def __init__(self, *args, **kwargs):
		if len(args) == 1:
			self.x = args[0].x
			self.y = args[0].y
		elif len(args) == 2:
			self.x = float(args[0])
			self.y = float(args[1])
		else:
			raise TypeError("Invalid number of arguments")

		for field in self._fields:
			setattr(self, field.name, kwargs.get(field.name))

		if 'srid' not in kwargs:
			srid = None
		else:
			srid = kwargs['srid']
			del kwargs['srid']

		if srid is None:
			self.srid = None
		else:
			self.srid = srid_map[srid]

		for key, value in kwargs.items():
			setattr(self, key, value)

	return type(name, (Point,), {'__init__': __init__, '_fields': fields})