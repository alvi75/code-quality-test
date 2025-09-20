using System;
using System.Collections.Generic;

public class Translation168
{
    public virtual GetDedicatedIpResponse GetDedicatedIp(GetDedicatedIpRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetDedicatedIpRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetDedicatedIpResponseUnmarshaller.Instance;
    return Invoke<GetDedicatedIpResponse>(request, options);
}
}