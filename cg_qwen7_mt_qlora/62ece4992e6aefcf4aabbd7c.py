def oneline(script, seperator=" && "):
	"""
	Convert a script to one line command with the given seperator.

        Args:
                script: str
                separator: str
        Returns:
                str, the one-line command.
	"""
	script = script.replace("\n", seperator)
	return script