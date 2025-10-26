ublic RegisterDeviceResponse RegisterDevice(RegisterDeviceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RegisterDeviceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RegisterDeviceResponseUnmarshaller.Instance;
    return Invoke<RegisterDeviceResponse>(request, options);
}