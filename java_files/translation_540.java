public CreateScriptResult createScript(CreateScriptRequest request) {
    request = beforeClientExecution(request);
    return executeCreateScript(request);
}