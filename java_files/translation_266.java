public GetFolderResult getFolder(GetFolderRequest request) {
    request = beforeClientExecution(request);
    return executeGetFolder(request);
}