def process_text_links(text):
	"""
	Process links in text, adding some attributes and linkifying textual links.
	"""
	text = re.sub(r'\bhttp://', r'<a href="http://\1">', text)
	text = re.sub(r'\bhttps://', r'<a href="https://\1">', text)
	text = re.sub(r'\bftp://', r'<a href="ftp://\1">', text)

	text = re.sub(r'&gt;', r'>', text)
	text = re.sub(r'&lt;', r'<' , text)

	text = re.sub(r'<br />', r'\n', text)
	text = re.sub(r'<br>', r'\n', text)
	text = re.sub(r'<p>', r'', text)
	text = re.sub(r'</p>', r'', text)

	text = re.sub(r'<i>', r'`', text)
	text = re.sub(r'</i>', r'`, ', text)
	text = re.sub(r'<b>', r'*', text)
	text = re.sub(r'</b>', r'*', text)
	text = re.sub(r'<u>', r'_', text)
	text = re.sub(r'</u>', r'_', text)
	text = re.sub(r'<font(.+?)</font>', r'[\2]', text)
	text = re.sub(r'<code>(.+?)</code>', r'`\1`', text)
	text = re.sub(r'<pre>(.+?)</pre>', r'``\1``', text)
	text = re.sub(r'<(.*?)>', r'<\1', text)
	text = re.sub(r'</(.*?)>', r'>\1', text)
	text = re.sub(r'<hr (.*)/>', r'<hr %s/>\n'.format(text), text)
	text = re.sub(r'<a href="(.*?)">(.*?)</a>', r'<a href="\g<1">' + \
			r'\g<2></a>', text)
	text = re.sub(r'<a href="(.*?)" class="mailman"><img src=/icons/mailman.gif alt=Mailman /></a>',
			r'<a href="\g<1">\g<2></a>', text)
	return text