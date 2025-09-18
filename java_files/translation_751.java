public ModifyAccountResult modifyAccount(ModifyAccountRequest request) {
    request = beforeClientExecution(request);
    return executeModifyAccount(request);
}