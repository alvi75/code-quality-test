def _parse_image_ref(image_href: str) -> Tuple[str, str, bool]:
	"""
	Parse an image href into composite parts import urllib.

    :param image_href: href of an image
    :returns: a tuple of the form (image_id, netloc, use_ssl)
    :raises ValueError:
	"""
	if not isinstance(image_href, str):
		raise TypeError("Image reference must be string")
	image_info = urlparse(image_href)

	if ":" in image_info.netloc:
		netloc_parts = image_info.netloc.split(":")
		use_https = "https" in image_info.scheme or netloc_parts[1] == 443
		return (
			image_info.path.lstrip("/"),
			":".join(netloc_parts[:2]),
			use_https,
		)
	else:
		use_https = "https" in image_info.scheme
		return (image_info.path.lstrip("/"), image_info.netloc, use_https)