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
	if not isinstance(n, int):
		raise TypeError("n must be an integer")
	if not isinstance(qid, int):
		raise TypeError("qid must be an integer")

	self._response = Response()
	self._response.set_header('Content-Type', 'text/plain')
	self._response.body = "DISCARD %s %s" % (n, qid)

	self._response.add_handlers(
		'application/x-pigpio-ipc', self._handle_discard_response)
	self._response.add_handlers(
		'application/x-pigpio-discard', self._handle_discard_response)
	self._response.add_handlers(
		'application/x-pigpio-raw', self._handle_raw_response)
	self._response.add_handlers(
		'application/x-pigpio-hybrid', self._handle_hybrid_response)
	self._response.add_handlers(
		'application/x-pigpio-ipc', self._handle_ipc_response)
	self._response.add_handlers(
		'application/x-pigpio-discard', self._handle_discard_response)
	self._response.add_handlers(
		'application/x-pigpio-raw', self._handle_raw_response)
	self._response.add_handlers(
		'application/x-pigpio-hybrid', self._handle_hybrid_response)
	self._response.add_handlers(
		'application/x-pigpio-ipc', self._handle_ipc_response)
	self._response.add_handlers(
		'application/x-pigpio-discard', self._handle_discard_response)
	self._response.add_handlers(
		'application/x-pigpio-raw', self._handle_raw_response)
	self._response.add_handlers