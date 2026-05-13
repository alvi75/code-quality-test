def _replace_url_args(url, url_args):
	"""
	Replace the value in url with the value in url_args
    If url_args has a value, iterate over the keys and values from url_args.
    Then replace the keys of the first parameter with values.
    Returns: the modified url.
	"""

	if not url_args:
		return url

	url = url.replace('?', '&')

	for key, val in url_args.items():
		if isinstance(val, list) or isinstance(val, tuple):
			val = ','.join([str(x) for x in val])
		else:
			val = str(val)

		url = re.sub(r'(?:(?<=\?)|(?<=[&]))%s=[^&]*' % key, '%s=%s' % (key, val), url)
	
	return url