def get_repo_archive(url: str, destination_path: Path) -> Path:
	"""
	Given an url and a destination path, retrieve and extract .tar.gz archive which contains 'desc' file for each package

        Args:
            url: url of the .tar.gz archive to download
            destination_path: the path on disk where to extract archive
        Returns:
                path where the archive is extracted to
	"""
	# TODO: this should be moved into the repo manager
	url = urlparse.urlparse(url)
	if not url.netloc or not url.path:
		raise ValueError("Invalid URL: %s" % url)

	# Get the repository's root directory
	repo_root_dir = os.path.join(os.path.dirname(__file__), '..')

	# Download the archive
	try:
		response = requests.get(url=url,
							   headers={'User-Agent': USER_AGENT},
							   verify=False)
	except Exception as e:
		raise RuntimeError('Failed to download repo archive from %s: %s' % (url, e))

	if response.status_code != 200:
		raise RuntimeError('Failed to download repo archive from %s with status code %d' % (url, response.status_code))

	# Extract the archive
	with tarfile.open(fileobj=io.BytesIO(response.content)) as tar:
		tar.extractall(path=repo_root_dir)

	# Copy all files in the repo to the destination path
	for f in glob.glob(os.path.join(repo_root_dir, '*.zip')):
		shutil.copy(f, destination_path / os.path.basename(f))
	return destination_path