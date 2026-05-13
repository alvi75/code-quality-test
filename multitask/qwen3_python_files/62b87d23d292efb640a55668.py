def get_config():
	"""
	Return a new VersioneerConfig() and set various attribute of it.
	"""
	config = VersioneerConfig()
	config._versionfile_source = os.environ.get('VERSIONEREN_SOURCE')
	config._versionfile_search_locations = os.environ.get(
		'VERSIONEREN_SEARCH', '').split(os.pathsep)
	config._versionfile_write_dir = os.environ.get(
		'VERSIONEREN_WRITE_DIR', '')
	config._versionfile_write_location = os.environ.get(
		'VERSIONEREN_WRITE_LOCATION', '')
	config._versionfile_write_name = os.environ.get(
		'VERSIONEREN_WRITE_NAME', 'version.txt')
	config._versionfile_read_name = os.environ.get(
		'VERSIONEREN_READ_NAME', 'version.txt')
	config._versionfile_setuptools_vcs = os.environ.get(
		'VERSIONEREN_SETUPTOOLS_VCS', '')
	config._versionfile_setuptools_vcs_verbose = os.environ.get(
		'VERSIONEREN_SETUPTOOLS_VCS_VERBOSE', '')
	config._versionfile_setuptools_vcs_show_scm_version = (
		os.environ.get(
			'VERSIONEREN_SETUPTOOLS_VCS_SHOW_SCM_VERSION', '') == 'true')
	config._versionfile_setuptools_vcs_show_scm_revision = (
		os.environ.get(
			'VERSIONEREN_SETUPTOOLS_VCS_SHOW_SCM_REVISION', '') == 'true')
	config._versionfile_setuptools_vcs_show_scm_date = (
		os.environ.get(
			'VERSIONEREN_SETUPTOOLS_VCS_SHOW_SCM_DATE', '') == 'true')
	config._versionfile_setuptools_vcs_show_scm_author = (
		os.environ.get(
			'VERSIONEREN_SETUPTOOLS_VCS_SHOW_SCM_AUTHOR', '') == 'true')
	config._versionfile_setuptools_vcs_show_scm_author_email = (
		os.environ.get(
			'VERSIONEREN_SETUPTOOLS_VCS_SHOW_SCM_AUTHOR_EMAIL', '') == 'true')
	config._versionfile_setuptools_vcs_show_scm_timestamp = (
		os.environ.get(
			'VERSIONEREN_SETUPTOOLS_VCS_SHOW_SCM_TIMESTAMP', '') == 'true')
	config._versionfile_setuptools_vcs_show_scm_timestamp_format = (