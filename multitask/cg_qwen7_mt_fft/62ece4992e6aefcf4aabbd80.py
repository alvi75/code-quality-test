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
		raise TypeError("input_list must be type list")
	output_list = [os.path.normpath(x) for x in input_list]
	return output_list