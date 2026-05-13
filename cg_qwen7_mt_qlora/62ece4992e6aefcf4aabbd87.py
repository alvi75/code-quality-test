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
	if not logger.handlers:
		logger.setLevel(logging.DEBUG if debug else logging.INFO)

	# Create handlers
	c_handler = logging.StreamHandler()
	f_handler = logging.FileHandler(logfile, mode='a')

	# Set levels
	c_handler.setLevel(logging.DEBUG if debug else logging.INFO)
	f_handler.setLevel(logging.DEBUG if debug else logging.INFO)

	# Create formatters and add it to handlers
	c_format = logging.Formatter('%(name)s - %(levelname)s - %(message)s')
	f_format = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
	c_handler.setFormatter(c_format)
	f_handler.setFormatter(f_format)

	# Add handlers to the logger
	logger.addHandler(c_handler)
	logger.addHandler(f_handler)

	return logger