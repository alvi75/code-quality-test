def point_type(name, fields, srid_map):
	"""
	Dynamically Generating Point Class
	"""

	def __init__(self, *args, **kwargs):
		if len(args) == 1:
			self.x = args[0]
			self.y = None
		elif len(args) == 2:
			self.x = args[0]
			self.y = args[1]

		for k in kwargs.keys():
			setattr(self, k, kwargs[k])

		if not hasattr(self, 'srid'):
			self.srid = srid_map.get(name)

	PointClass = type('Point', (object,), {
		'__slots__': ['x', 'y'],
		'__init__': __init__,
		'__str__': lambda self: "POINT(%f %f)" % (self.x, self.y),
		'__repr__': lambda self: "<%s (%f,%f)>" % (name, self.x, self.y)
	})

	return PointClass