def discard(self, n=-1, qid=-1, dehydration_hooks=None,
               hydration_hooks=None, **handlers):
	"""
	Appends a DISCARD message to the output queue.

:param n: number of records to discard, default = -1 (ALL)
:param qid: query ID to discard for, default = -1 (last query)
:param dehydration_hooks:
    Hooks to dehydrate types (dict from type (class) to dehydration
    function). Dehydration functions receive the value and returns an
    object of type understood by packstream.
:param hydration_hooks:
    Hooks to hydrate types (mapping from type (class) to
    dehydration function). Dehydration functions receive the value of
    type understood by packstream and are free to return anything.
:param handlers: handler functions passed into the returned Response object
	"""
	if not self._can_discard():
	    raise InvalidOperation('Stream is closed')
	self._assert_valid_query_id(qid)

	msg = MsgProto(EMsg.ClientDiscardMessages)
	msg.body.n = n
	msg.body.qid = qid

	for k in sorted(handlers.keys()):
	    msg.body.handlers.add(k)
	    msg.body.handlers[k] = handlers[k]

	if dehydration_hooks:
	    msg.body.dehydrated_handlers = dehydration_hooks

	if hydration_hooks:
	    msg.body.hydration_handlers = hydration_hooks

	self.send(msg)