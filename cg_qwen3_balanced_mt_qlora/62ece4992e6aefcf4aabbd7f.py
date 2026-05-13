def _parse_image_ref(image_href: str) -> Tuple[str, str, bool]:
	"""
	Parse an image href into composite parts import urllib.

    :param image_href: href of an image
    :returns: a tuple of the form (image_id, netloc, use_ssl)
    :raises ValueError:
	"""
	if not image_href.startswith('http'):
		raise ValueError("Image href must be an http(s) URL")

	parts = urlparse(image_href)

	image_id = parts.path.split('/')[-1]
	netloc = parts.netloc
	use_ssl = parts.scheme == 'https'

	return image_id, netloc, use_ssl