def _extract_number_and_supplment_from_issue_element(issue):
	"""
	Return the possible values of number and sup from the contents of issue.
	"""
	number = None
	sup = None

	if issue is not None:
		for child in issue.childNodes:
			if child.nodeType == child.ELEMENT_NODE:
				if child.tagName == 'number':
					number = child.firstChild.nodeValue
				elif child.tagName == 'sup':
					sup = child.firstChild.nodeValue

	return number, sup