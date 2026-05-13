def remove_ending_os_sep(input_list):
	"""
	If input list is None, return []
    Iterate over a string list and remove trailing os seperator characters.
    Each string is tested if its length is greater than one and if the last
    character is the pathname seperator.
    Returns:
    A list after removing trailing os seperator characters.
	"""
	if not isinstance(input_list,list):
		return []
	else:
		output_list = []
		for item in input_list:
			if len(item) > 1 and item[-1] == os.sep:
				item = item[:-1]
			output_list.append(item)
		return output_list