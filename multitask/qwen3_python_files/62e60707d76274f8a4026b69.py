def point_type(name, fields, srid_map):
	"""
	Dynamically Generating Point Class
	"""
	class_name = name
	class_fields = fields
	class_srid_map = srid_map

	class_name = class_name.title()
	class_name = class_name[0] + class_name[1:].lower()

	class_name = "Point" + class_name

	class_name = class_name.replace(" ", "")

	class_name = class_name.replace("_", "")

	class_name = class_name.replace("-", "")

	class_name = class_name.replace("(", "")

	class_name = class_name.replace(")", "")

	class_name = class_name.replace(" ", "")

	class_name = class_name.replace(".", "")

	class_name = class_name.replace(":", "")

	class_name = class_name.replace("/", "")

	class_name = class_name.replace("@", "")

	class_name = class_name.replace("#", "")

	class_name = class_name.replace("$", "")

	class_name = class_name.replace("%", "")

	class_name = class_name.replace("&", "")

	class_name = class_name.replace("*", "")

	class_name = class_name.replace("+", "")

	class_name = class_name.replace("!", "")

	class_name = class_name.replace("?", "")

	class_name = class_name.replace("=", "")

	class_name = class_name.replace("<", "")

	class_name = class_name.replace(">", "")

	class_name = class_name.replace(";", "")

	class_name = class_name.replace(":", "")

	class_name = class_name.replace(" ", "")

	class_name = class_name.replace("(", "")

	class_name = class_name.replace(")", "")

	class_name = class_name.replace(" ", "")

	class_name = class_name.replace(".", "")

	class_name = class_name.replace(":", "")

	class_name = class_name.replace("/", "")

	class_name = class_name.replace("(", "")

	class_name = class_name.replace(")", "")

	class_name = class_name.replace(" ", "")

	class_name = class_name.replace("(", "")

	class_name = class_name.replace(")", "")

	class_name = class_name.replace(" ", "")

	class_name = class_name.replace(".", "")

	class_name = class_name.replace(":", "")

	class_name = class_name.replace("/", "")

	class_name = class_name.replace("(", "")

	class_name = class_name.replace(")", "")

	class_name = class_name.replace(" ", "")

	class_name = class_name.replace("(", "")

	class_name = class_name.replace(")", "")

	class_name = class_name.replace(" ", "")

	class_name = class_name.replace(".", "")

	class_name = class_name.replace(":", "")

	class_name = class_name.replace("/", "")

	class_name = class_name.replace("(", "")

	class_name = class_name.replace