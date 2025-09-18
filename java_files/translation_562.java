public RegisterDeviceResult registerDevice(RegisterDeviceRequest request) {
    request = beforeClientExecution(request);
    return executeRegisterDevice(request);
}