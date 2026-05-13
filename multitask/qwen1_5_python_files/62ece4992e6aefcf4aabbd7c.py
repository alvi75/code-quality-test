def oneline(script, seperator=" && "):
    """
        Convert a script to one line command with the given seperator.

        Args:
                script: str
                separator: str
        Returns:
                str, the one-line command.
	"""
    if not isinstance(script, list):
        raise TypeError("script must be a list of strings")
    return seperator.join([str(i) for i in script])