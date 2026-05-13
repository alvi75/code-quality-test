def base_config(user, etcd_host="localhost", etcd_port=2379):
		"""
		Creates a configuration with some simple parameters, the key parameters contains "tls", "authentication", "authorization", "etcd", "docs", and "log".
		"""
		config = {
			"tls": False,
			"authentication": {"method": "token"},
			"authorization": {"bound_service": ["*"], "bound_ip_prefixes": ["*"]},
			"etcd": {
				"host": etcd_host,
				"port": int(etcd_port)
			}
		}

		if user:
			config["authentication"]["user"] = user

		return config