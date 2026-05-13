def _extract_number_and_supplment_from_issue_element(issue):
	"""
	Return the possible values of number and sup from the contents of issue.
	"""
	number = None
	sup = None

	for el in issue:
		if el.tag == 'sup':
			sup = el.text
		elif el.tag == 'abbr' and el.attrib['title'] == 'DOI':
			number = el.text

	return (number, sup)