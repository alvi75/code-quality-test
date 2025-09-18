public GetShardIteratorResult getShardIterator(GetShardIteratorRequest request) {
    request = beforeClientExecution(request);
    return executeGetShardIterator(request);
}