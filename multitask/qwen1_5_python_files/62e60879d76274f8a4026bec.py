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
        if self._transaction_depth > 0:
            raise Exception("Nested transactions not allowed")

        # TODO: add support for automatic transaction demarcation

        msg = MsgProto(MsgType.BEGIN_TRANSACTION)

        msg.header.transaction_flags = TransactionFlags(mode=mode, read_only=(mode == READ))
        msg.body.bookmarks.extend(bookmarks or [])
        msg.metadata = metadata or {}

        if db is not None:
            msg.db = db

        if imp_user is not None:
            msg.imp_user = imp_user

        if timeout is not None:
            msg.timeout = int(timeout * 1000)

        if dehydration_hooks is not None:
            msg.dehydrated_hook = list(dehydration_hooks.items())

        if hydration_hooks is not None:
            msg.hydrated_hook = list(hydration_hooks.items())

        for k, v in handlers.items():
            msg.handlers[k] = v

        self._output_queue.put(msg.SerializeToString())
        self._transaction_depth += 1

        return self.wait()