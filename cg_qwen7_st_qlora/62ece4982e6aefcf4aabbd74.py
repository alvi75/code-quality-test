def prepare_repository_from_archive(
    archive_path: str,
    filename: Optional[str] = None,
    tmp_path: Union[PosixPath, str] = "/tmp",
) -> str:
	"""
	Given an existing archive_path, uncompress it.
    Returns a file repo url which can be used as origin url.

    This does not deal with the case where the archive passed along does not exist.
    @param archive_path : archive file path
    @param filename: File name
    @param tmp_path: Temporary file path
    @return Repo URL
	"""

	if not os.path.exists(archive_path):
		raise FileNotFoundError("Archive {} doesn't exists".format(archive_path))

	if not filename:
		filename = os.path.basename(archive_path)

	tmp_dir = tempfile.mkdtemp(dir=tmp_path)
	repo_url = "file://" + tmp_dir

	try:
		with tarfile.open(archive_path) as tar:
			tar.extractall(path=tmp_dir)
	except Exception as e:
		shutil.rmtree(tmp_dir)
		raise e

	return repo_url