def remove_ending_os_sep(input_list):
	"""
	def remove_ending_os_sep(input_list):
	"""
	if input_list is not None:
		for i in range(len(input_list)):
			if len(input_list[i]) > 1 and input_list[i][-1] == os.sep:
				input_list[i] = input_list[i][:-1]
	return input_list