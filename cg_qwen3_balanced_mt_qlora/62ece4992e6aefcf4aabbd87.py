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
	if not len(logger.handlers):
		# create console handler with a higher log level
		ch = logging.StreamHandler()
		if debug:
			ch.setLevel(logging.DEBUG)
		else:
			ch.setLevel(logging.INFO)

		# create formatter and add it to the handlers
		formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
		ch.setFormatter(formatter)

		# add the handlers to the logger
		logger.addHandler(ch)

		# create file handler which logs even debug messages
		fh = logging.FileHandler(logfile)
		fh.setLevel(logging.DEBUG)

		# create formatter and add it to the handlers
		formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
		fh.setFormatter(formatter)

		# add the handlers to the logger
		logger.addHandler(fh)
	return logger