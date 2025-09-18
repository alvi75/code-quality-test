AllocateStaticIpResult allocateStaticIp(AllocateStaticIpRequest request) {
    request = beforeClientExecution(request);
    return executeAllocateStaticIp(request);
}