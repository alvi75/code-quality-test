using System;
using System.Collections.Generic;

public class Translation883
{
    public virtual AllocateStaticIpResponse AllocateStaticIp(AllocateStaticIpRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AllocateStaticIpRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AllocateStaticIpResponseUnmarshaller.Instance;
    return Invoke<AllocateStaticIpResponse>(request, options);
}
}