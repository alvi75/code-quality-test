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
    env = os.environ.copy()
    if extra_env:
        env.update(extra_env)
    return subprocess.run([func] + list(args), stdout=sys.stdout,
                          stderr=sys.stderr, universal_newlines=True, env=env, timeout=timeout)