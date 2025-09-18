public DeleteAppResult deleteApp(DeleteAppRequest request) {
    request = beforeClientExecution(request);
    return executeDeleteApp(request);
}