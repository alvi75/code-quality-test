def _replace_url_args(url, url_args):
	"""
	Replace the value in url with the value in url_args
    If url_args has a value, iterate over the keys and values from url_args.
    Then replace the keys of the first parameter with values.
    Returns: the modified url.
	"""
	if not url_args:
		return url

	for key, val in url_args.items():
		url = re.sub(r'(?<=\?|&)' + key + r'=.*?(?=&|$)', key + '=' + str(val), url)
	return url