def os_is_mac():
    """
    Checks if the os is macOS

    :return: bool, True is macOS, otherwise False.
	"""
    sys_platform = platform.system()
    return sys_platform == "Darwin" or (sys_platform.startswith("Darwin") and len(sys_platform) > 5)