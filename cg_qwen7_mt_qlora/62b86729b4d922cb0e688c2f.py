def base_config(user, etcd_host="localhost", etcd_port=2379):
	"""
	Creates a configuration with some simple parameters, the key parameters contains "tls", "authentication", "authorization", "etcd", "docs", and "log".
	"""

	config = {
		"tls": {
			"cert_file": "/etc/ssl/certs/server.crt",
			"key_file": "/etc/ssl/private/server.key"
		},
		"authentication": {
			"users": [
				user,
			],
			"passwords": {
				user: "password",
			}
		},
		"authorization": {
			"roles": [
				{
					"name": user,
					"permissions": ["readwrite"],
				},
			]
		},
		"etcd": {
			"host": etcd_host,
			"port": etcd_port,
		},
		"log": {
			"level": "debug",
		},
	}

	return config