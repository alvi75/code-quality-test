def point_type(name, fields, srid_map):
	"""
	Dynamically Generating Point Class
	"""
	
	# Create a new class for each field type
	class PointType(type('PointType', (object,), {})):
		pass
	
	# Set up the default values for the class
	for name in fields:
		if name == 'geometry':
			continue
	
		# Get the value of the field from the database
		value = getattr(self, name)
		
		# If the value is not None or empty, set it to 0
		if value is not None and len(value) > 0:
			value = float(value)
		
		# Set the value as a string so that we can use it with the DB
		value = str(value)
		
		# Set the value as a GeoJSON feature
		value = {'type': 'Feature',
				  'geometry': {'coordinates': [value[0], value[1]]}}
		
		# Set the value as a dictionary
		value = {name: value}
		
		# Set the value as a list
		value = [value]
		
		# Set the value as a tuple
		value = tuple(value)
		
		# Set the value as a list of lists
		value = [[value]]
		
		# Set the value as a list of tuples
		value = [(value)]
		
		# Set the value as a list of strings
		value = [str(value)]
		
		# Set the value as a list of numbers
		value = [float(value)]
		
		# Set the value as a list of floats
		value = [float(value)]
		
		# Set the value as a list of longs
		value = [long(value)]
		
		# Set the value as a list of ints
		value = [int(value)]
		
		# Set the value as a list of shorts
		value = [short(value)]
		
		# Set the value as a list of shorts
		value = [short(value)]
		
		# Set the value as a list of longs
		value = [long(value)]
		
		# Set the value as a list of ints
		value = [int(value)]
		
		# Set the value as a list of floats
		value = [float(value)]
		
		# Set the value as a list of doubles
		value = [