def __init__(self, *args, **kwargs):
		""" 
			Constructor for Point class.
			
			This function will create a new instance of Point class with the specified name and field list.
			The field list is used to determine the type of each coordinate in the geometry.
			Note that this constructor only works for 2D geometries.
			For 3D geometries, please use the Point3d constructor instead.
		"""
		
		if len(args) == 0:
			raise ValueError("No arguments were passed into the constructor.")
		
		for i in range(len(fields)):
			if not isinstance(fields[i], basestring):
				raise TypeError("Field %s must be a string" % (i+1))
		
		self.name = name
		
		self.fields = []
		for f in fields:
			self.fields.append(f)
		
		self.srid = None
		
		for i in range(0,len(self.fields),2):
			f1 = self.fields[i]
			f2 = self.fields[i+1]
			if f1[0] != 'X' or f2[0] != 'Y':
				raise ValueError("%s and %s must start with X." % (f1,f2))
			if f1[1:] != f2[1:]:
				raise ValueError("%s and %s must have same format." % (f1,f2))
			if f1[1] == 'x':
				self.x_fields.append(f1[1:])
				self.y_fields.append(f2[1:])
			else:
				self.x_fields.append(f1[1:])
				self.y_fields.append(f2[1:])
		
		if len(set(srid_map.keys()) & set(self.fields)) > 0:
			raise ValueError("Some fields already exist in the SRID map")
		
		for f in srid_map.values():
			if f not in self.fields:
				raise ValueError("Invalid SRID value: %s" % (f,))
		
		for f in self.fields:
			if f not in srid_map.values():
				raise ValueError("Invalid field: %s" % (f,))
		
		for f in srid_map.keys():
			if f not in self.fields:
				raise ValueError("Missing SRID value: %s" % (f,))
		
		for f in self.fields:
			if f not in srid_map.keys():
				raise ValueError("Missing field: %s" % (f,))