def get_nodeinfo_well_known_document(url, document_path=None):
	"""
	Returns a formatted dictionary, including information such as url and document_path.
	"""
	if document_path is None:
		document_path = os.path.join(os.getcwd(), 'nodeinfo.json')
	return {
		"links": [
			{
				"rel": "http://webfinger.net/rel/profiles",
				"type": "application/xrd+xml",
				"href": url,
			},
			{
				"rel": "http://webfinger.net/rel/profiles",
				"type": "application/json",
				"href": url + "/.well-known/nodeinfo",
			}
		],
		"software": {
			"name": "Mastodon",
			"version": "1.0"
		},
		"protocols": ["activitypub"],
		"services": {
			"inbox": [url + "/inbox"],
			"outbox": [url + "/outbox"]
		},
		"endpoints": {
			"sharedInbox": url + "/shared-inbox"
		}
	}