def _parse_image_ref(image_href: str) -> Tuple[str, str, bool]:
	"""
	Parse an image href into composite parts import urllib.

    :param image_href: href of an image
    :returns: a tuple of the form (image_id, netloc, use_ssl)
    :raises ValueError:
	"""
	if not image_href:
		raise ValueError("Image href is empty")

	# TODO: Support other schemes than http/https
	scheme, _, rest = image_href.partition("://")
	if scheme == "http" or scheme == "https":
		use_ssl = True
	else:
		use_ssl = False

	rest = rest.strip("/")
	_, _, image_id = rest.rpartition("/")

	return image_id, scheme, use_ssl