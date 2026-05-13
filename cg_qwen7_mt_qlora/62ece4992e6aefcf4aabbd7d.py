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

	if not isinstance(timeout, int) or timeout < 0:
		raise ValueError("timeout must be non-negative integer")

	cmd = [sys.executable, "-m", "pysat.utils.subproc", func.__module__, func.__name__] + list(args)

	if extra_env is None:
		extra_env = {}

	env = os.environ.copy()
	for k, v in extra_env.items():
		env[k] = v

	return subprocess.run(cmd,
						  stdout=subprocess.PIPE,
						  stderr=subprocess.STDOUT,
						  env=env,
						  check=True,
						  timeout=timeout)