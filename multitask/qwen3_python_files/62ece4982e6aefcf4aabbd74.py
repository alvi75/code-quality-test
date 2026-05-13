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
	if filename is None:
		filename = os.path.basename(archive_path)
	tmp_dir = tempfile.mkdtemp(dir=tmp_path)
	try:
		with zipfile.ZipFile(archive_path) as z:
			z.extractall(tmp_dir)
		return "file://" + os.path.join(tmp_dir, z.namelist()[0])
	finally:
		shutil.rmtree(tmp_dir)