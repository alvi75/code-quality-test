def point_type(name, fields, srid_map):
	"""
	Dynamically Generating Point Class
	"""
	if name not in _point_types:
		Point2D = namedtuple(name, fields)
		Point2D.__name__ = str(name)

		def __new__(cls, x, y):
			return Point2D(x=x, y=y),

		Point2D.__new__.__defaults__ = (None, None,)
		Point2D.__module__ = 'GeoDSL'
		_point_types[name] = Point2D

	srids = [k for k, v in list(srid_map.items()) if type(v) is dict]
	if len(srids) > 0:
		for key in srids:
			srid = int(key)
			aliases = [_ for _, _ in list(srid_map[srid].items())]

			for alias in aliases:
				_point_types[alias] = _point_types[key]

	return _point_types.get(name)