def _parse_image_ref(image_href: str) -> Tuple[str, str, bool]:
	"""
	Parse an image href into composite parts import urllib.

    :param image_href: href of an image
    :returns: a tuple of the form (image_id, netloc, use_ssl)
    :raises ValueError:
	"""

	if not image_href.startswith('http'):
		return image_href, '', False

	parsed = urlparse(image_href)

	image_id = parsed.path[1:]
	netloc = parsed.netloc
	use_ssl = parsed.scheme == 'https'

	return image_id, netloc, use_ssl