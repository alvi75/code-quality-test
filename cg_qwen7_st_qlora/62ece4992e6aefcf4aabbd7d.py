def subprocess_run_helper(func, *args, timeout, extra_env=None):
	"""
	Run a function in a sub-process

    Args:
            func: function, the function to be run. It must be in a module that is importable.
            *args: str. Any additional command line arguments to be passed in
                        the first argument to ``subprocess.run``.
            extra_env: dict[str, str]. Any additional environment variables to be set for the subprocess.
    Returns:
            CompletedProcess instance
	"""

	if not isinstance(args, (list, tuple)):
		args = [str(args)]

	if extra_env is None:
		extra_env = {}

	try:
		return subprocess.run(
			[sys.executable, '-m', func.__module__] + list(args),
			timeout=timeout,
			check=True,
			env=dict(os.environ, **extra_env)
		)

	except subprocess.TimeoutExpired as e:
		raise TimeoutError(e) from e