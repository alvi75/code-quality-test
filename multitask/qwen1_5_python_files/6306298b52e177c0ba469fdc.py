def xml_children_as_dict(node):
	"""
	Turn the children of node <xml> into a dict, keyed by tag name.
	"""
	result = {}
	for child in node:
		if isinstance(child.tag, basestring) and \
				child.tag.lower() == 'item':
			title = child.find('title').text
			link = child.find('link').text
			description = child.find('description').text
			author = child.find('author').find('name').text
			author_mailto = None
			if child.find('author') is not None:
				author_mailto = child.find('author').find('mailto').text
			published_parsed = parse_datetime(child.find('pubDate').text)
			published = published_parsed.strftime('%Y-%m-%d %H:%M:%S')
			category = None
			if child.find('category') is not None:
				category = child.find('category').text
			guid = child.find('guid').text
			image_url = None
			if child.find('image') is not None:
				image_url = child.find('image').find('url').text
			result[title] = {
				'url': link,
				'description': description,
				'author': author,
				'author_mailto': author_mailto,
				'published': published,
				'category': category,
				'guid': guid,
				'image_url': image_url,
				'publish_date': published_parsed,
				}
	return result