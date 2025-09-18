public StartTaskResult startTask(StartTaskRequest request) {
    request = beforeClientExecution(request);
    return executeStartTask(request);
}