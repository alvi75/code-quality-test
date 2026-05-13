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
		raise TypeError("destination_path must be instance of class pathlib.Path")

	archive = Downloader().download_file(url)

	extract_directory = destination_path / "extracted"
	extract_directory.mkdir(parents=True, exist_ok=True)
	tarfile.open(archive).extractall(str(extract_directory))

	return extract_directory