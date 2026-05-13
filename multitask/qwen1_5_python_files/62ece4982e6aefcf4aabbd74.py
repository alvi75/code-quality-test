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
    @param filename: File Name
    @param tmp_path: Temporary file path
    @return Repo URL
	"""
    if isinstance(tmp_path, str):
        tmp_path = Path(tmp_path)
    assert isinstance(archive_path, str), f"Expecting string {type(archive_path)}"
    assert isinstance(filename, (str, type(None))), f"Expecting string or None {type(filename)}"

    # TODO: Add support for other archives here

    if filename is None:
        filename = os.path.basename(archive_path)

    # Extract the archive to a temporary directory
    tmp_dir = tempfile.mkdtemp(dir=tmp_path)
    try:
        logger.info(f"Extracting {filename} from {archive_path}")
        tarfile.open(str(archive_path)).extractall(str(tmp_dir))
    except Exception as e:
        raise RuntimeError(f"Failed to extract {filename} from {archive_path}: {e}")

    # Find the repository root in the extracted files
    # We assume that the first directory is the repository root
    # This assumption holds true for all the archives we have tested so far
    # If this assumption ever changes, we need to update the code below
    for dirpath, _, filenames in walk(tmp_dir):
        for filename in filenames:
            if filename == "config.yaml":
                break
        else:
            continue
        return f"file://{dirpath}/{filename}"

    raise RuntimeError("Could not find config.yaml in the archive")