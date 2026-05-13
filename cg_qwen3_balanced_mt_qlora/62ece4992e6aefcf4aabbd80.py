def remove_ending_os_sep(input_list):
	"""
	If input list is None, return []
    Iterate over a string list and remove trailing os seperator characters.
    Each string is tested if its length is greater than one and if the last
    character is the pathname seperator.
    Returns:
    A list after removing trailing os seperator characters.
	"""
	if input_list is None:
		return []

	for i in range(len(input_list)):
		if len(input_list[i]) > 1 and input_list[i][-1] == os.sep:
			input_list[i] = input_list[i][:-1]

	return input_list