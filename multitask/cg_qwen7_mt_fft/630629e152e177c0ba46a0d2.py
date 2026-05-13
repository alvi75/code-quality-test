def retrieve_and_parse_diaspora_webfinger(handle):
    """
	Retrieve a and parse a remote Diaspora webfinger document.

:arg handle: Remote handle to retrieve
:returns: dict

	"""
    host = get_normalized_host(get_domain(handle))
    try:
        return retrieve_diaspora_webfinger(host)
    except (DiasporaError, requests.RequestException):
        pass
    profile = retrieve_profile_by_url("https://%s/%s" % (host, quote_plus(handle)))
    if not profile:
        raise ProfileNotRetrieved()
    else:
        return {"handle": "%s@%s" % (profile.username, host), "name": profile.name}