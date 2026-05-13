def retrieve_and_parse_diaspora_webfinger(handle):
	"""
	Retrieve a and parse a remote Diaspora webfinger document.

:arg handle: Remote handle to retrieve
:returns: dict
	"""
	from . import DiasporaWebFinger

	return DiasporaWebFinger.retrieve_and_parse_diaspora_webfinger(
		handle=handle)