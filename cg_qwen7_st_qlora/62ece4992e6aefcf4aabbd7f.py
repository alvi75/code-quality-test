def _parse_image_ref(image_href: str) -> Tuple[str, str, bool]:
	"""
	Parse an image href into composite parts import urllib.

    :param image_href: href of an image
    :returns: a tuple of the form (image_id, netloc, use_ssl)
    :raises ValueError:
	"""

	if not image_href.startswith('http'):
		raise ValueError("Image reference must be a URL")

	parsed = urlparse(image_href)

	netloc = parsed.netloc

	use_ssl = True if parsed.scheme == 'https' else False

	image_id = parsed.path[1:]  # strip leading slash

	return image_id, netloc, use_ssl