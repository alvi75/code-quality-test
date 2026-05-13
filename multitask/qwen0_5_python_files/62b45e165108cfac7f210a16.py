def validate_as_prior_version(self, prior):
	"""
	Check that prior is a valid prior version of the current inventory object. The input variable prior is also expected to be an InventoryValidator object and both self and prior inventories are assumed to have been checked for internal consistency. Return error() in the class.
	"""
	if not isinstance(prior, InventoryValidator):
		return False

	# Check that prior has same number of rows as self
	if len(self) != len(prior):
		return False

	# Check that prior has same column names as self
	for col_name in prior.col_names:
		if col_name not in self.col_names:
			return False

	# Check that prior has same column types as self
	for col_name in prior.col_names:
		if type(self[col_name]) != type(prior[col_name]):
			return False

	# Check that prior has same values as self
	for row_index in range(len(self)):
		for col_name in prior.col_names:
			if type(self[row_index][col_name]) == list:
				if len(self[row_index][col_name]) != len(prior[col_name][row_index]):
					return False
			elif type(self[row_index][col_name]) != type(prior[col_name][row_index]):
				return False
			elif type(self[row_index][col_name]) == dict:
				if set(self[row_index][col_name].keys()) != set(prior[col_name][row_index].keys()):
					return False
				else:
					for key in self[row_index][col_name]:
						if type(self[row_index][col_name][key]) == list:
							if len(self[row_index][col_name][key]) != len(prior[col_name][row_index][key]):
								return False
						elif type(self[row_index][col_name][key]) != type(prior[col_name][row_index][key]):
							return False
						elif type(self[row_index][col_name][key]) == dict:
							if set(self[row_index][col_name][key].keys()) != set(prior[col_name][row_index][key].keys()):
								return False
							else:
								for key1 in self[row_index][col_name][key]:
									if type(self[row_index][col_name][key1]) == list:
										if len(self[row_index][col_name][key1]) != len(prior[col_name][row_index][key1]):
											return False
									elif type(self[row_index][col_name][key1