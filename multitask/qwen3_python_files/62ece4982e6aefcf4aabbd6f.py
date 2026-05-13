def get_repo_archive(url: str, destination_path: Path) -> Path:
	"""
	Given an url and a destination path, retrieve and extract .tar.gz archive which contains 'desc' file for each package

        Args:
            url: url of the .tar.gz archive to download
            destination_path: the path on disk where to extract archive
        Returns:
                path where the archive is extracted to
	"""
	archive = wget.download(url)
	archive_name = os.path.basename(archive)
	archive_dir = os.path.join(destination_path, archive_name.split('.')[0])
	os.mkdir(archive_dir)
	with tarfile.open(archive, 'r:gz') as tar:
		tar.extractall(archive_dir)
	return Path(archive_dir)