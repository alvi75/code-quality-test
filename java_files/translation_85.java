public GetApisResult getApis(GetApisRequest request) {
    request = beforeClientExecution(request);
    return executeGetApis(request);
}