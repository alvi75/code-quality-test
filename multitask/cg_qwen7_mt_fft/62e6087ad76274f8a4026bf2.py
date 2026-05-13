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
    dehydration function). Dehydrated values are received as arguments
    in this order: (type, value). Hydration functions can raise any
    exception including AbortTransaction to abort current transaction.
:param handlers: handler functions passed into the returned Response object

	"""
        self._request_queue.put(
            RequestMessage('discard', {'n': n, 'qid': qid},
                           None, None, None, None, None, None, **handlers),
            True, 0)

        if not self._response_available.wait(1.0):
            raise ConnectionError("Discard request timed out")