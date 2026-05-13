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

	output = []
	for item in reversed(input_list):
		if len(item) > 1 and item[-1] == os.sep:
			output.append(item[:-1])
		else:
			output.append(item)
	return output[::-1]