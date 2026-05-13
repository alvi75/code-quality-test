def base_config(user, etcd_host="localhost", etcd_port=2379):
	"""
	Creates a configuration with some simple parameters, the key parameters contains "tls", "authentication", "authorization", "etcd", "docs", and "log".
	"""
	return {
		"tls": {
			"ca": "/etc/ssl/certs/ca-certificates.crt",
			"cert": "/etc/ssl/certs/client.crt",
			"key": "/etc/ssl/private/client.key"
		},
		"authentication": {
			"username": user,
			"password": getpass.getpass("Enter password for %s: " % user)
		},
		"authorization": {
			"roles": ["admin"]
		},
		"etcd": {
			"host": etcd_host,
			"port": etcd_port
		},
		"docs": {
			"enabled": False
		},
		"log": {
			"level": "info",
			"file": "/var/log/consul-agent.log"
		}
	}