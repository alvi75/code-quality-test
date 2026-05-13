def get_repo_archive(url: str, destination_path: Path) -> Path:
	"""
	Given an url and a destination path, retrieve and extract .tar.gz archive which contains 'desc' file for each package

        Args:
            url: url of the .tar.gz archive to download
            destination_path: the path on disk where to extract archive
        Returns:
                path where the archive is extracted to
	"""
	if not isinstance(destination_path, Path):
		raise TypeError("destination_path must be a pathlib.Path object")

	try:
		response = requests.get(url)
	except Exception as e:
		raise RuntimeError(f"Failed to fetch {url}: {e}")

	if response.status_code != 200:
		raise RuntimeError(f"Unexpected status code {response.status_code} fetching {url}")

	tar_file = tarfile.open(fileobj=io.BytesIO(response.content))
	tar_file.extractall(path=str(destination_path))

	return destination_path / "desc"