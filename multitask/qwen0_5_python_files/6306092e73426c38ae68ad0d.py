def create_complex_argumet_type(self, subcommand, type_name, option_name, spec_option):
	"""
	Returns the corresponding function in COMPLEX_TYPES based on type_name and returns the result obtained by complex_action after option_name,(self.vars, self.defaults, self.plugin_path), subcommand, spec_option) is input.
	"""
	if type_name == 'int':
		return lambda x: int(x)
	elif type_name == 'float':
		return float(x)
	elif type_name == 'bool':
		return bool(x)
	elif type_name == 'str':
		return str(x)
	elif type_name == 'list':
		return [x for x in x]
	elif type_name == 'dict':
		return {key: value for key, value in x.items()}
	elif type_name == 'tuple':
		return tuple(x for x in x)
	elif type_name == 'set':
		return set(x for x in x)
	elif type_name == 'complex':
		return (x.real, x.imag)
	elif type_name == 'json':
		import json
		return json.loads(x)
	elif type_name == 'xml':
		import xml.etree.ElementTree as ET
		import StringIO
		import sys
		import os
		import re
		import string
		import tempfile
		import urllib
		import xml.dom.minidom
		import xml.dom.NodeSet
		import xml.dom.Node
		import xml.dom.NodeList
		import xml.dom.NodeError
		import xml.dom.DOMException
		import xml.dom.DOMImplementation
		import xml.dom.DOMImplementationLS
		import xml.dom.Element
		import xml.dom.ElementTree
		import xml.dom.Node
		import xml.dom.NodeSet
		import xml.dom.NodeList
		import xml.dom.NodeError
		import xml.dom.DOMException
		import xml.dom.DOMImplementation
		import xml.dom.DOMImplementationLS
		import xml.dom.Element
		import xml.dom.ElementTree
		import xml.dom.Node
		import xml.dom.NodeSet
		import xml.dom.NodeList
		import xml.dom.NodeError
		import xml.dom.DOMException
		import xml.dom.DOMImplementation
		import xml.dom.DOMImplementationLS
		import xml.dom.Element
		import xml.dom.ElementTree
		import xml.dom.Node
		import xml.dom.NodeSet
		import xml.dom.NodeList
		import xml.dom.NodeError
		import xml.dom.DOMException
		import xml.dom.DOMImplementation
		import xml.dom.DOMImplementationLS
		import xml