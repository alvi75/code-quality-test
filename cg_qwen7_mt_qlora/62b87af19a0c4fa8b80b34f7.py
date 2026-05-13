def difference(d1, d2, level=-1):
	"""
	Return a dictionary with items from d1 not contained in d2.
	"""

	if isinstance(d1, dict) and isinstance(d2, dict):

		difference = {}

		for key in d1:
			if key not in d2:
				difference[key] = d1[key]
			else:
				diff = difference(d1[key], d2[key])
				if diff != {}:
					difference[key] = diff

	elif isinstance(d1, list) and isinstance(d2, list):
		return [x for x in d1 if x not in d2]

	else:
		return d1