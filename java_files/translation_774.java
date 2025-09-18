public StopTaskResult stopTask(StopTaskRequest request) {
    request = beforeClientExecution(request);
    return executeStopTask(request);
}