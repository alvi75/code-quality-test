def point_type(name, fields, srid_map):
	"""
	Dynamically Generating Point Class
	"""
	class Point(geom_type(name, fields, srid_map)):
		def __init__(self, *args, **kwargs):
			super(Point, self).__init__(*args, **kwargs)
			self.geom_type = 'Point'
			self.srid = self._get_srid()

		def _get_srid(self):
			if self.srid is None:
				return srid_map.get('default', 4326)
			else:
				return self.srid

		def _set_srid(self, value):
			self.srid = value

		srid = property(_get_srid, _set_srid)

	@classmethod
	def from_wkt(cls, wkt):
		"""Create a new Point object from a WKT string."""
		return cls(wkt=wkt)

	@classmethod
	def from_coords(cls, x, y, z=None, srid=None):
		"""Create a new Point object from coordinates."""
		return cls(x=x, y=y, z=z, srid=srid)

	@classmethod
	def from_point(cls, point, srid=None):
		"""Create a new Point object from another Point object."""
		return cls(x=point.x, y=point.y, z=point.z, srid=srid)

	@classmethod
	def from_point3d(cls, point, srid=None):
		"""Create a new Point object from another Point3D object."""
		return cls(x=point.x, y=point.y, z=point.z, srid=srid)

	@classmethod
	def from_point2d(cls, point, srid=None):
		"""Create a new Point object from another Point2D object."""
		return cls(x=point.x, y=point.y, srid=srid)

	@classmethod
	def from_point3dz(cls, point, srid=None):
		"""Create a new Point object from another Point3DZ object."""
		return cls(x=point.x, y=point.y, z=point.z, srid=srid)

	@classmethod
	def from_point3dm(cls, point, srid=None):
		"""Create a new Point object from another Point3DM object."""
		return cls(x=point.x, y=point.y, z=point.m, srid=srid)

	@classmethod
	def from_point3dzm