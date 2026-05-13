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
	if not self._connected:
		raise ConnectionError('No connection available')

	if mode is None:
		mode = 'WRITE'

	if db is None:
		db = self._db

	if imp_user is None:
		imp_user = self._imp_user

	if timeout is None:
		timeout = self._timeout

	if metadata is None:
		metadata = {}

	if handlers is None:
		handlers = {}

	if mode.upper() == 'READ':
		self._read_transaction = True
	else:
		self._read_transaction = False

	if isinstance(bookmarks, list):
		bookmarks = tuple(bookmarks)

	if isinstance(imp_user, User):
		imp_user = imp_user.name

	if isinstance(db, Database):
		db = db.name

	if isinstance(dehydration_hooks, dict):
		dehydration_hooks = [dehydration_hooks]

	if isinstance(hydration_hooks, dict):
		hydration_hooks = [hydration_hooks]

	if isinstance(handlers, dict):
		handlers = [handlers]

	message = {
		'op': 'begin',
		'mode': mode,
		'bookmarks': bookmarks,
		'db': db,
		'imp_user': imp_user,
		'timeout': timeout,
		'metadata':