def _replace_url_args(url, url_args):
	"""
	Replace the value in url with the value in url_args
    If url_args has a value, iterate over the keys and values from url_args.
    Then replace the keys of the first parameter with values.
    Returns: the modified url.
	"""
	url = urlparse.urlparse(url)
	for key, value in six.iteritems(url_args):
		if len(value) == 1:
			value = [value]
		url = list(url)
		url[0] = url[0].replace(key, value[0])
		url[1:] = value[1:]
	return urlparse.urlunparse(url)