def list_of_file_names(settings_dirs, spec_option):
	"""
	Create and return a new IniType complex type via cli.ListOfFileNames()
	"""
	import os
	import re

	spec = OptionParser(list_of_file_names.__doc__)
	spec.add_option("--", "--specification",
		type="string",
		default=spec_option,
		help="specification to use")
	spec.set_outfile()

	options, args = spec.parse_args(args=sys.argv[1:])

	if len(args) != 2:
		sys.exit(not spec.print_help())

	specification = options.specification
	specification = specification.split(",")
	specification = [x.strip() for x in specification]
	specification = [x for x in specification if x]

	file_name = args[0]
	file_name = file_name.split(" ")[-1]
	file_name = file_name.replace(".ini", "")
	file_name = file_name.replace(".INI", "")

	file_name = file_name.replace("\\", "/")

	file_name = file_name.replace("/", "\\")
	file_name = file_name.replace("\\", "/")

	file_name = file_name.replace(" ", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":", "_")

	file_name = file_name.replace(":",