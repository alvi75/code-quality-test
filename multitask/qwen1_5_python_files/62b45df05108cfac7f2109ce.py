def validate(self, path):
	"""
	Returns True if OCFL object at path or pyfs root, False otherwise.
	"""
	if self.is_root:
	    return True

	try:
	    # Try to get the file from PyFS
	    self.pyfs.get_file(path)
	    return True
	except FileDoesNotExistError:
	    pass

	try:
	    # Try to get the file from S3
	    self.s3client.head_object(Bucket=self.bucket_name, Key=path)
	    return True
	except ClientError as e:
	    if e.response['Error']['Code'] == '404':
	        return False
	    else:
	        raise