def begin(self, mode=None, bookmarks=None, metadata=None, timeout=None,
              db=None, imp_user=None, dehydration_hooks=None,
              hydration_hooks=None, **handlers):
	"""
	Appends a BEGIN message to the output queue.

:param mode: access mode for routing - "READ" or "WRITE" (default)
:param bookmarks: iterable of bookmark values after which this transaction should begin
:param metadata: custom metadata dictionary to attach to the transaction
:param timeout: timeout for transaction execution (seconds)
:param db: name of the database against which to begin the transaction
    Requires Bolt 4.0+.
:param imp_user: the user to impersonate
    Requires Bolt 4.4+
:param dehydration_hooks:
    Hooks to dehydrate types (dict from type (class) to dehydration
    function). Dehydration functions receive the value and returns an
    object of type understood by packstream.
:param hydration_hooks:
    Hooks to hydrate types (mapping from type (class) to
    dehydration function). Dehydration functions receive the value of
    type understood by packstream and are free to return anything.
:param handlers: handler functions passed into the returned Response object
@return: Response object
	"""
	if mode is None:
		mode = 'WRITE'
	elif mode not in ('READ', 'WRITE'):
		raise BoltProtocolError('Invalid mode %r' % mode)

	if bookmarks is not None:
		if not isinstance(bookmarks, list):
			raise BoltProtocolError('Bookmarks must be a list')

	if metadata is not None:
		if not isinstance(metadata, dict):
			raise BoltProtocolError('Metadata must be a dict')

	if timeout is not None:
		if not isinstance(timeout, int):
			raise BoltProtocolError('Timeout must be an integer')

	if db is not None:
		if not isinstance(db, str):
			raise BoltProtocolError('Database name must be a string')

	if imp_user is not None:
		if not isinstance(imp_user, str):
			raise BoltProtocolError('Impersonated user must be a string')

	if dehydration_hooks is not None:
		if not isinstance(dehydration_hooks, dict):
			raise BoltProtocolError('Dehydration hooks must be a dict')

	if hydration_hooks is not None:
		if not isinstance(hydration_hooks, dict):
			raise BoltProtocolError('Hydration hooks must be a dict')

	return self._send_message(
		BEGIN,
		mode=mode,
		bookmarks=bookmarks,
		metadata=