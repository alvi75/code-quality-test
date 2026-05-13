def paging(response, max_results):
	"""
	Return every response with the length of max_results
    Args:
    response (list): WAPI response.
    max_results (int): Maximum number of objects to be returned in one page.
    Returns:
        Generator object with WAPI response split page by page.
	"""
	for i in range(0, len(response), max_results):
		yield response[i:i + max_results]