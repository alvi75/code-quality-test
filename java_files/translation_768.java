public ActivateUserResult activateUser(ActivateUserRequest request) {
    request = beforeClientExecution(request);
    return executeActivateUser(request);
}