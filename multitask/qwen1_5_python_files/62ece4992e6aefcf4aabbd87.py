def build_app_logger(name='app', logfile='app.log', debug=True):
	"""
	General purpose application logger. Useful mainly for debugging
    Args:
        name: The name of logger
        logfile: The log file need to save
        debug: is need to debug

    Returns:
        Returns an instantiated logger object
	"""
	global app_log, app_debug
	app_log = logging.getLogger(name)
	if not isinstance(logfile, str):
		raise TypeError('logfile must be a string')
	if not os.path.exists(os.path.dirname(logfile)):
		os.makedirs(os.path.dirname(logfile))
	app_log.setLevel(logging.DEBUG if debug else logging.INFO)
	shandler = logging.StreamHandler()
	shandler.setLevel(logging.DEBUG if debug else logging.INFO)
	fmt = '%(asctime)s %(levelname)-8s:%(name)s - %(message)s'
	shandler.setFormatter(logging.Formatter(fmt))
	app_log.addHandler(shandler)

	filehandler = logging.FileHandler(logfile)
	filehandler.setLevel(logging.DEBUG)
	fmt = '%(asctime)s %(levelname)-8s:%(name)s - %(message)s'
	filehandler.setFormatter(logging.Formatter(fmt))
	app_log.addHandler(filehandler)