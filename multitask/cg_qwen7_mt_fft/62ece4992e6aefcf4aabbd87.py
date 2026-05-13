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
	logger = logging.getLogger(name)
	if not hasattr(logger, 'level'):
		logger.setLevel(logging.DEBUG)

	shandler = logging.StreamHandler()
	shandler.setFormatter(logging.Formatter('%(message)s'))
	logger.addHandler(shandler)

	fhandler = logging.FileHandler(logfile)
	fhandler.setFormatter(logging.Formatter(
		'%(asctime)s %(levelname)-8s (%name)s [%(filename)s:%(lineno)3s] %(message)s'
	))
	logger.addHandler(fhandler)

	if debug:
		shandler.setLevel(logging.DEBUG)
		fhandler.setLevel(logging.DEBUG)
	else:
		shandler.setLevel(logging.WARNING)
		fhandler.setLevel(logging.ERROR)

	return logger