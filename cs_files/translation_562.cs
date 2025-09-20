using System;
using System.Collections.Generic;

public class Translation562
{
    public virtual RegisterDeviceResponse RegisterDevice(RegisterDeviceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RegisterDeviceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RegisterDeviceResponseUnmarshaller.Instance;
    return Invoke<RegisterDeviceResponse>(request, options);
}
}