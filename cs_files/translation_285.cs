using System;
using System.Collections.Generic;

public class Translation285
{
    public virtual CreateDedicatedIpPoolResponse CreateDedicatedIpPool(CreateDedicatedIpPoolRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateDedicatedIpPoolRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateDedicatedIpPoolResponseUnmarshaller.Instance;
    return Invoke<CreateDedicatedIpPoolResponse>(request, options);
}
}