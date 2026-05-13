def get_repo_archive(url: str, destination_path: Path) -> Path:
	"""
	Given an url and a destination path, retrieve and extract .tar.gz archive which contains 'desc' file for each package

        Args:
            url: url of the .tar.gz archive to download
            destination_path: the path on disk where to extract archive
        Returns:
                path where the archive is extracted to
	"""
	if not destination_path.exists():
		destination_path.mkdir(parents=True)
	archive_path = destination_path / "repo.tar.gz"
	with requests.get(url, stream=True) as r:
		r.raise_for_status()
	with open(archive_path, "wb") as f:
		for chunk in r.iter_content(chunk_size=8192):
			f.write(chunk)
	tar = tarfile.open(str(archive_path))
	tar.extractall(destination_path)
	return destination_path