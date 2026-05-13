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
	if not isinstance(args[0], list):
		args = [args]
	if extra_env is None:
		extra_env = {}
	else:
		extra_env = extra_env.copy()
		extra_env.update(os.environ)
	return subprocess.run([func.__module__, func.__name__] + args,
						   stdout=subprocess.PIPE,
						   stderr=subprocess.PIPE,
						   env=extra_env,
						   timeout=timeout)