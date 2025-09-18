public DeleteApiKeyResult deleteApiKey(DeleteApiKeyRequest request) {
    request = beforeClientExecution(request);
    return executeDeleteApiKey(request);
}