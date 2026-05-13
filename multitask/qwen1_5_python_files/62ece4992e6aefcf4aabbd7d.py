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
    if not isinstance(args[0], string_types):
        raise TypeError('The first argument of %s must be a string' % (func.__name__,))

    # Create a temporary directory where the executable will be located
    with temp_dir() as tmpdir:
        # Copy the executable into this directory
        shutil.copyfile(
            os.path.abspath(os.path.join(ROOT_DIR, 'bin', args[0])),
            os.path.join(tmpdir, args[0])
        )

        # Run the executable using subprocess.run
        env = os.environ.copy()
        if extra_env:
            env.update(extra_env)
        return subprocess.run(
            [os.path.join(tmpdir, args[0])],
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            check=True,
            universal_newlines=True,
            env=env,
            timeout=timeout
        )