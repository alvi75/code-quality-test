def _c_optimizations_required():
	"""
	Return a true value if the C optimizations are required.
	"""
	if sys.platform == 'win32':
		return True

	if not HAVE_CCODEC:
		return True

	if not HAVE_CUNICODE:
		return True

	if not HAVE_CSTL:
		return True

	if not HAVE_CTIME:
		return True

	if not HAVE_CTHREADS:
		return True

	if not HAVE_CVARS:
		return True

	if not HAVE_CVARIANTS:
		return True

	if not HAVE_CVARIANTS2:
		return True

	if not HAVE_CVARIANTS3:
		return True

	if not HAVE_CVARIANTS4:
		return True

	if not HAVE_CVARIANTS5:
		return True

	if not HAVE_CVARIANTS6:
		return True

	if not HAVE_CVARIANTS7:
		return True

	if not HAVE_CVARIANTS8:
		return True

	if not HAVE_CVARIANTS9:
		return True

	if not HAVE_CVARIANTS10:
		return True

	if not HAVE_CVARIANTS11:
		return True

	if not HAVE_CVARIANTS12:
		return True

	if not HAVE_CVARIANTS13:
		return True

	if not HAVE_CVARIANTS14:
		return True

	if not HAVE_CVARIANTS15:
		return True

	if not HAVE_CVARIANTS16:
		return True

	if not HAVE_CVARIANTS17:
		return True

	if not HAVE_CVARIANTS18:
		return True

	if not HAVE_CVARIANTS19:
		return True

	if not HAVE_CVARIANTS20:
		return True

	if not HAVE_CVARIANTS21:
		return True

	if not HAVE_CVARIANTS22:
		return True

	if not HAVE_CVARIANTS23:
		return True

	if not HAVE_CVARIANTS24:
		return True

	if not HAVE_CVARIANTS25:
		return True

	if not HAVE_CVARIANTS26:
		return True

	if not HAVE_CVARIANTS27:
		return True

	if not HAVE_CVARIANTS28:
		return True

	if not HAVE_CVARIANTS29:
		return True

	if not HAVE_CVARIANTS30:
		return True

	if