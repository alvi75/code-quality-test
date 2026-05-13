def parse_diaspora_webfinger(document: str) -> Dict:
	"""
	The webfinger is obtained by reading the document in JSON format, the value of hcard_url in the webfinger is the value of href in links in the document.
	"""
	data = json.loads(document)
	wf = {}
	if "hcard_url" in data["person"]:
		wf["diaspora_handle"] = data["person"]["hcard_url"]
	elif "email" in data["person"]:
		wf["diaspora_handle"] = data["person"]["email"].split("@")[0]
	else:
		raise ValueError("Could not find a valid Diaspora handle in the provided document")
	for link in data["links"]:
		if link["rel"] == "self":
			wf[link["href"]] = None
	return wf