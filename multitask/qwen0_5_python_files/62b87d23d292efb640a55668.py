def get_config():
	"""
	Return a new VersioneerConfig() and set various attribute of it.
	"""
	import pkg_resources

	# Get version from setup.py
	version = pkg_resources.get_distribution('versioneer').version

	# Get project name from setup.py
	project_name = pkg_resources.get_distribution('versioneer').project_name

	# Get source directory path
	source_dir = os.path.dirname(os.path.abspath(__file__))

	# Get current working directory
	cwd = os.getcwd()

	# Set up .versioneer.py file
	# This is needed to be able to use the same versioneer.py in both python 2 and 3
	# See https://github.com/PyCQA/pylint/issues/1079
	# TODO: Remove this once we have support for python 3.4+ (and also remove the
	#       need for the following if)
	if not os.path.exists('.versioneer.py'):
		with open('.versioneer.py', 'w') as f:
			f.write("""""" + "# -*- coding: utf-8 -*-\n")
			f.write("import sys\n")
			f.write("from versioneer import *\n")
			f.write("from setuptools import setup, find_packages\n")
			f.write("from codecs import getencoder\n")
			f.write("import imp\n")
			f.write("import os\n")
			f.write("import re\n")
			f.write("import shutil\n")
			f.write("import tempfile\n")
			f.write("import tarfile\n")
			f.write("import zipfile\n")
			f.write("from distutils.dir_util import _get_current_directory\n")
			f.write("from distutils.sysconfig import get_python_lib\n")
			f.write("from distutils.ccompiler import new_compiler\n")
			f.write("from distutils.ccompiler import new_compiler\n")
			f.write("from distutils.ccompiler import new_compiler\n")
			f.write("from distutils.ccompiler import new_compiler\n")
			f.write("from distutils.ccompiler import new_compiler\n")
			f.write("from distutils.ccompiler import new_compiler\n")
			f.write("from distutils.ccompiler import new_compiler\n")
			f.write("from distutils.ccompiler import new_compiler\n")
			f.write("from distutils.ccompiler import new_compiler\n")
			f.write("from distutils.ccompiler import new_compiler\n")
			f.write("from distutils.ccompiler import new_compiler