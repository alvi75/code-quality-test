def namesAndDescriptions(self, all=False):
	"""
	Returns the name and description of the current class attribute.
	"""
	if self._currentClass is None:
			return []
	result = []
	for key in sorted(self._currentClass.__dict__.keys()):
		if not all and UcsUtils.FindClassIdInMoMetaIgnoreCase(key) == 0:
			continue

		propMeta = UcsUtils.GetUcsPropertyMeta(self._classId, key)
		if propMeta:
			propDescr = ""
			if 'desc' in propMeta:
				propDescr = propMeta['desc']
			result.append([key, propDescr])
		else:
			result.append(["", ""])
	return result