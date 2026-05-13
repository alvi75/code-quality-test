def _should_attempt_c_optimizations():
	"""
	Return a true value if we use the C optimizations.
	"""
	return (
		# We have to do this because of the way that the C compiler works with
		# the -O2 flag, which is not supported by the Pylint backend.
		# See https://github.com/pypylint/pylint/issues/1036
		# and https://github.com/pypylint/pylint/issues/1047
		# TODO: This should be fixed in the future.
		# TODO: The following line may be removed when the above issue is fixed.
		#       It's here for backwards compatibility.
		#       If you want to disable the C optimizations, set `use_c=False`.
		#       This will cause pylint to ignore all warnings.
		#       You can also disable the C optimizations using the command line:
		#           $ pylint --disable=C
		#           $ pylint --enable=C
		#           $ pylint --ignore=C
		#           $ pylint --ignore=C=1
		#           $ pylint --ignore=C=2
		#           $ pylint --ignore=C=3
		#           $ pylint --ignore=C=4
		#           $ pylint --ignore=C=5
		#           $ pylint --ignore=C=6
		#           $ pylint --ignore=C=7
		#           $ pylint --ignore=C=8
		#           $ pylint --ignore=C=9
		#           $ pylint --ignore=C=10
		#           $ pylint --ignore=C=11
		#           $ pylint --ignore=C=12
		#           $ pylint --ignore=C=13
		#           $ pylint --ignore=C=14
		#           $ pylint --ignore=C=15
		#           $ pylint --ignore=C=16
		#           $ pylint --ignore=C=17
		#           $ pylint --ignore=C=18
		#           $ pylint --ignore=C=19
		#           $ pylint --ignore=C=20
		#           $ pylint --ignore=C=21
		#           $ pylint --ignore=C=22
		#           $ pylint --ignore