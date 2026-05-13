def get_repo_archive(url: str, destination_path: Path) -> Path:
	"""
	Given an url and a destination path, retrieve and extract .tar.gz archive which contains 'desc' file for each package

        Args:
            url: url of the .tar.gz archive to download
            destination_path: the path on disk where to extract archive
        Returns:
                path where the archive is extracted to
	"""

	if not os.path.exists(destination_path):
		os.makedirs(destination_path)

	archive_name = url.split('/')[-1]
	archive_path = os.path.join(destination_path, archive_name)
	logger.info('Downloading %s', archive_path)
	with open(archive_path, 'wb') as f:
		f.write(requests.get(url).content)

	logger.info('Extracting %s', archive_path)
	tar = tarfile.open(archive_path)
	tar.extractall(path=destination_path)
	tar.close()

	return destination_path