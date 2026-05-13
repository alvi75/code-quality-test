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

	# create a handler to store logs in file
	file_handler = logging.FileHandler(logfile, mode='a')
	file_handler.setLevel(logging.DEBUG)

	# create formatter and add it to the handlers
	formatter = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
	file_handler.setFormatter(formatter)

	# add the handlers to the logger
	logger.addHandler(file_handler)

	return logger