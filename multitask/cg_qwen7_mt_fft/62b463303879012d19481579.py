def _extract_number_and_supplment_from_issue_element(issue):
	"""
	Return the possible values of number and sup from the contents of issue.
	"""

	# Find the first alphanumeric character in the string, this is where the
	# numbering system starts (e.g. 1 for volume 1)
	start = re.search(r'\w', issue)

	if start:
		# Find the last alphanumeric character in the string, this is where the
		# numbering system ends (e.g. 2 for volume 2)
		end = len(re.findall(r'\W+', issue[start.start():]))
		if end > 0:
			end += start.start() - 1

		# The number is a special case, it's not preceded by any punctuation,
		# whereas the supplement needs to be identified by either 'supp' or
		# 'volissue'
		number_match = re.match(
			r'^(\d+)(.*)$', issue[start.start():end])
		supplement_match = re.match(
			r'.*?(volissue|supp)(.*)$', issue[start.start():end])

		if number_match:
			return int(number_match.group(1)), number_match.group(2).strip()
		elif supplement_match:
			return None, supplement_match.group(2).strip()

	return None, ''