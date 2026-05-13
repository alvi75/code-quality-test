def _replace_url_args(url, url_args):
	"""
	Replace the value in url with the value in url_args
    If url_args has a value, iterate over the keys and values from url_args.
    Then replace the keys of the first parameter with values.
    Returns: the modified url.
	"""
	if not url_args:
		return url

	url_parts = urlparse.urlparse(url)
	query_params = parse.parse_qsl(url_parts.query)

	for key, val in six.iteritems(url_args):
		if isinstance(val, list) or isinstance(val, tuple):
			val = ",".join(val)
		query_params[key] = val

	new_query = urllib.urlencode(query_params)
	new_url = urlparse.urlunparse((url_parts.scheme,
									url_parts.netloc,
									url_parts.path,
									url_parts.params,
									new_query,
									url_parts.fragment))
	return new_url