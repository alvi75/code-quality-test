def decorator(f):
		"""The actual decorator function"""

		# The actual decorator implementation
		def wrapper(*args, **kwargs):

			# Get the key for this call
			k = key(args, kwargs)

			# Try to get the result from the cache
			try:
				return cache[k]
			except KeyError:
				pass

			# If we're here, then there's no cached value for this call
			# So, let's execute the function and save the result in the cache

			# Call the wrapped function
			v = f(*args, **kwargs)

			# Store the result in the cache
			cache[k] = v

			# Return the result
			return v

		# Return the actual wrapper function
		return wrapper

	# Return the actual decorator function
	return decorator