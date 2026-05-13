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
	logger.setLevel(logging.DEBUG if debug else logging.INFO)
	file_handler = logging.FileHandler(logfile)
	file_handler.setLevel(logging.DEBUG)
	file_handler.setFormatter(logging.Formatter('%(asctime)s %(levelname)-7s:%(name)s:%(funcName)s:%(lineno)s - %(message)s'))
	logger.addHandler(file_handler)
	return logger