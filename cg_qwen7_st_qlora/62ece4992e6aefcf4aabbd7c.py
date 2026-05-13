def oneline(script, seperator=" && "):
    """
	Convert a script to one line command with the given seperator.

        Args:
                script: str
                separator: str
        Returns:
                str, the one-line command.
	"""

    if isinstance(script, list):
        return seperator.join([oneline(s) for s in script])
    else:
        return re.sub(r"\s+", " ", script).strip()