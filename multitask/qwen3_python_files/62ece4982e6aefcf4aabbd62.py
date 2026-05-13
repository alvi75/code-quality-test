def _replace_url_args(url, url_args):
	"""
	Replace the value in url with the value in url_args
    If url_args has a value, iterate over the keys and values from url_args.
    Then replace the keys of the first parameter with values.
    Returns: the modified url.
	"""
	if not url_args:
		return url

	url = urlparse.urlparse(url)
	query = urlparse.parse_qs(url.query)

	for key, val in url_args.items():
		if isinstance(val, list):
			val = ','.join(val)
		query[key] = val

	return urlparse.urlunparse((url.scheme, url.netloc, url.path, url.params, urlencode(query), url.fragment))