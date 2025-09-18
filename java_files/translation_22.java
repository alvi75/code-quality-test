public TagQueueResult tagQueue(TagQueueRequest request) {
    request = beforeClientExecution(request);
    return executeTagQueue(request);
}