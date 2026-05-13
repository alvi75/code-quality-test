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
	if os.path.exists(archive_path):
		with open(archive_path, "rb") as f:
			archive = tarfile.open(fileobj=f)
	else:
		raise ValueError("Archive %s does not exist" % archive_path)

	# Get all files in the archive
	files = [f for f in archive.getnames() if f.endswith(".tar")]
	# Unpack the archive into a temporary directory
	tempdir = tempfile.mkdtemp()
	try:
		archive.extractall(path=tempdir)
	except Exception as e:
		raise RuntimeError("Error unpacking archive %s: %s" % (archive_path, e))
	# Create a temporary file to hold the extracted contents of the archive
	file_path = "%s/%s" % (tempdir, filename or "")
	try:
		with open(file_path, "wb") as f:
			for chunk in archive:
				f.write(chunk)
	except Exception as e:
		raise RuntimeError("Error extracting archive %s: %s" % (archive_path, e))

	# Remove the temporary directory
	shutil.rmtree(tempdir)

	return "file://%s" % file_path