def _parse_image_ref(image_href: str) -> Tuple[str, str, bool]:
	"""
	Parse an image href into composite parts import urllib.

    :param image_href: href of an image
    :returns: a tuple of the form (image_id, netloc, use_ssl)
    :raises ValueError:
	"""
	if not isinstance(image_href, str):
		raise TypeError("Expected string type for image_href")
	parts = urlparse.urlsplit(image_href)
	if len(parts.scheme) == 0 or len(parts.netloc) == 0:
		return os.path.basename(parts[2]), None, False

	return os.path.basename(parts[2]), parts.netloc, parts.scheme in ("https", "http")