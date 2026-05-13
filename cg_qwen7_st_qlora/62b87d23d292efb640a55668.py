def get_config():
	"""
	Return a new VersioneerConfig() and set various attribute of it.
	"""

	def find_root(cwd=None):
		"""Find the root of the project source tree."""
		if cwd is None:
			cwd = os.getcwd()
		while not os.path.exists(os.path.join(cwd, "setup.py")):
			newcwd = os.path.abspath(os.path.join(cwd, ".."))
			if newcwd == cwd:
				raise Exception("unable to find setup.py")
			cwd = newcwd
		return cwd

	root = find_root()

	top_dir = os.path.basename(root)
	repo_name = top_dir.lower().replace("-", "_").replace(".", "_")

	try:
		from setuptools_scm import get_version as s_get_version
		from setuptools_scm_git_archive import parse_scm_archives
	except ImportError:
		s_get_version = None
	else:
		# if we're running from a git archive, use setuptools_scm to calculate
		# version information
		version = s_get_version(
			root=root,
			write_to=os.path.join(top_dir, "__version__.py"),
			tag_prefix="v",
			pre_tag_suffix="-dev"
		)
		parsed_version = parse_scm_archives(version)

		if parsed_version:
			# found a version in the archive; return it
			return VersioneerConfig.from_cmd_args(
				top_dir=top_dir,
				repo_name=repo_name,
				version=parsed_version,
				cmdargs=["--short"],
			)

	# otherwise, try to load config from file
	config = VersioneerConfig.load_from_file(root, top_dir, repo_name)
	if config:
		return config

	# no config file? Try to guess the right version format
	verfile_source = os.path.join(top_dir, "VERSION.txt")
	if os.path.isfile(verfile_source):
		# VERSION.txt exists: use that
		with open(verfile_source) as f:
			version = f.read().strip()
	else:
		# no VERSION.txt: look for __init__.py or .git directory
		init_py = os.path.join(top_dir, "__init__.py")
		git_dir = os.path.join(root, ".git")
		if os.path.isdir(git_dir):
			# .git directory exists: assume this is a git repo
			version = "0+unknown"
		elif os.path.isfile(init_py):
			# __init__.py