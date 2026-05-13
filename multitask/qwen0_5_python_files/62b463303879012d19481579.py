def _extract_number_and_supplment_from_issue_element(issue):
	"""
	Return the possible values of number and sup from the contents of issue.
	"""
	number = issue.find('number').text
	supplemental = issue.find('supplemental')
	if supplemental is not None:
		number += ' (supplemental)'
	return number, supplemental