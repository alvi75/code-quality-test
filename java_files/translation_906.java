public RebootNodeResult rebootNode(RebootNodeRequest request) {
    request = beforeClientExecution(request);
    return executeRebootNode(request);
}