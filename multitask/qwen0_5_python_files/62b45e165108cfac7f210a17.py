def get_logical_path_map(inventory, version):
	"""
	Returns the file paths of the states in the inventory in the dict type.
	"""
	# TODO: This is a hack to work around the fact that the state files have no path information.
	#       We need to figure out how to properly handle this.
	#       The following should be good enough for now:
	#       https://github.com/saltstack/salt/issues/23079
	#       https://github.com/saltstack/salt/pull/23146
	#       https://github.com/saltstack/salt/pull/23158
	#       https://github.com/saltstack/salt/pull/23159
	#       https://github.com/saltstack/salt/pull/23160
	#       https://github.com/saltstack/salt/pull/23161
	#       https://github.com/saltstack/salt/pull/23162
	#       https://github.com/saltstack/salt/pull/23163
	#       https://github.com/saltstack/salt/pull/23164
	#       https://github.com/saltstack/salt/pull/23165
	#       https://github.com/saltstack/salt/pull/23166
	#       https://github.com/saltstack/salt/pull/23167
	#       https://github.com/saltstack/salt/pull/23168
	#       https://github.com/saltstack/salt/pull/23169
	#       https://github.com/saltstack/salt/pull/23170
	#       https://github.com/saltstack/salt/pull/23171
	#       https://github.com/saltstack/salt/pull/23172
	#       https://github.com/saltstack/salt/pull/23173
	#       https://github.com/saltstack/salt/pull/23174
	#       https://github.com/saltstack/salt/pull/23175
	#       https://github.com/saltstack/salt/pull/2