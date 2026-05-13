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
:return: Response object
	"""
	if not self._is_open:
		raise ValueError("Cannot begin a transaction when session is closed")

	if mode is None:
		mode = 'READ'
	if bookmarks is None:
		bookmarks = []
	if metadata is None:
		metadata = {}
	if timeout is None:
		timeout = 120

	self._transactions.append((mode, bookmarks, metadata, timeout, db, imp_user,
								dehydrated_hooks=dehydrated_hooks, hydration_hooks=hydration_hooks))

	return Response()