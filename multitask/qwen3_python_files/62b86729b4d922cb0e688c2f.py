def base_config(user, etcd_host="localhost", etcd_port=2379):
	"""
	Creates a configuration with some simple parameters, the key parameters contains "tls", "authentication", "authorization", "etcd", "docs", and "log".
	"""
	config = {
		"tls": {},
		"authentication": {},
		"authorization": {},
		"etcd": {"host": etcd_host, "port": etcd_port},
		"docs": {},
		"log": {}
	}
	if user:
		config["authentication"]["user"] = user
	return config