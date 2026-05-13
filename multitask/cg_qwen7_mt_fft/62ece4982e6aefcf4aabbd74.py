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
        raise FileNotFoundError(f"Archive {archive_path} could not be found.")

    # Unzip/untar here...
    try:
        tar_file = tarfile.open(archive_path)
        tar_info_list = tar_file.getmembers()
        assert len(tar_info_list) > 0

        first_tar_info = tar_info_list[0]
        second_tar_info = tar_info_list[1]

        if isinstance(first_tar_info, TarInfo) \
                and isinstance(second_tar_info, TarInfo):

            base_name = Path(first_tar_info.name).stem

            full_base_dir = Path(tmp_path) / base_name
            full_base_dir.mkdir(parents=True, exist_ok=True)

            tar_file.extractall(path=tmp_path)

            return "file://" + str(full_base_dir)

    except Exception as e:
        print(e)
        pass

    return ""