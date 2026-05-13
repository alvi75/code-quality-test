def _parse_image_ref(image_href: str) -> Tuple[str, str, bool]:
	"""
	Parse an image href into composite parts import urllib.

    :param image_href: href of an image
    :returns: a tuple of the form (image_id, netloc, use_ssl)
    :raises ValueError:
	"""
	if not image_href.startswith("docker://"):
		raise ValueError("Invalid image reference %s" % image_href)

	# TODO: this is probably wrong for docker://<image>:<tag>
	# but it's easier to just ignore that.
	# TODO: should we be using the first part as the image id?
	# TODO: should we be using the last part as the tag?

	# split off the hostname from the rest of the image name
	hostname = image_href.split("://")[0]
	image_name = image_href.split(":")[1]

	# parse out the username/password if present
	username, password = None, None

	# try to get the username/password from the environment variable
	username_envvar = os.environ.get("DOCKER_USERNAME")
	password_envvar = os.environ.get("DOCKER_PASSWORD")

	if username_envvar is not None:
		username = username_envvar
	elif password_envvar is not None:
		password = password_envvar

	# if there's no username/password in the environment variables,
	# or they're empty, then assume the default value
	if username is None or len(username) == 0:
		username = "default"
	elif password is None or len(password) == 0:
		password = "default"

	# now build up the full url to query the registry
	url = f"https://{username}:{password}@{hostname}/images/{image_name}"

	return image_name, url, True