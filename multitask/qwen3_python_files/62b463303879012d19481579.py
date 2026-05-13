def _extract_number_and_supplment_from_issue_element(issue):
	"""
	Return the possible values of number and sup from the contents of issue.
	"""
	number = None
	supplemental = None

	for child in issue:
		if child.tag == 'number':
			number = child.text
		elif child.tag == 'supplemental':
			supplemental = child.text

	return (number, supplemental)