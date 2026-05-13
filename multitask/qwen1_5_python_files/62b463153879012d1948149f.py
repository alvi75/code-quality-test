def _eval_file(prefix, file_path):
	"""
	Identify the type of the given file. Return None if the file do not match the given prefix or the type of the file is xml. Return dict with the key of component_id, file_path if the type of the file is "pdf", return dict with the key of component_id, file_path, ftype, file_path if the type of the file is not "pdf".
	"""
	if os.path.isfile(file_path) and \
	   os.path.splitext(file_path)[1].lower() in ['.pdf', '.docx']:
		file_type = 'pdf'
	elif os.path.isfile(file_path) and \
			os.path.splitext(file_path)[1].lower() == '.xml':
		file_type = 'xml'
	else:
		return None

	if file_type == 'pdf' and not file_path.startswith(prefix):
		return None

	with open(file_path, 'rb') as pdf_file_obj:
		pdf_reader = PyPDF2.PdfFileReader(pdf_file_obj)
		num_pages = pdf_reader.numPages

		for page_num in range(num_pages):
			page = pdf_reader.getPage(page_num)

			text = ''
			for txt in page.extractText().splitlines():
				text += txt + '\n'

			yield {
				'component_id': file_path,
				'file_path': file_path,
				'file_type': file_type,
				'text': text.strip()
			}