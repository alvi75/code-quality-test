def remove_ending_os_sep(input_list):
	"""
	If input list is None, return []
    Iterate over a string list and remove trailing os seperator characters.
    Each string is tested if its length is greater than one and if the last
    character is the pathname seperator.
    Returns:
    A list after removing trailing os seperator characters.
	"""
	if not input_list:
		return []

	output = [x for x in input_list]
	for i in range(len(output)):
		if len(output[i]) > 1 and output[i][-1] == os.sep:
			output[i] = output[i][:-1]

	return output