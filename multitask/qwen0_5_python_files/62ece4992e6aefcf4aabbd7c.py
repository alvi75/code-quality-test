def oneline(script, seperator=" && "):
	"""
	Convert a script to one line command with the given seperator.

        Args:
                script: str
                seperator: str
        Returns:
                str, the one-line command.
	"""
	return seperator.join([script]) if isinstance(script, list) else script