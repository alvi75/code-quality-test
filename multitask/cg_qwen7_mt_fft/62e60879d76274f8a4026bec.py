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
    dehydration function). Dehydrated values will be received as None!
    Use :func:`packstream.loads` with `force_types=False`.
    Hydration functions receive the value of
    type understood by packstream and are free to return anything.
:param handlers: handler functions passed into the returned Response object
:return: Response object
	"""

	if not self._connected:
			raise NotConnectedError("Cannot run queries without connecting first.")

	if mode is None:
			mode = WRITE_ACCESS

	msg = Message(BEGIN, version=1, mode=mode.value, bookmarks=list(bookmarks),
				  metadata=metadata, timeout=timeout, db=db, imp_user=imp_user)

	self._write_message(msg)

	return Response(self, mode, **handlers, dehydrate=self.dehydrate,
					hydrations=hydration_hooks, dehydration=dehydration_hooks)