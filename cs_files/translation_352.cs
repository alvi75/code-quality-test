using System;
using System.Collections.Generic;

public class Translation352
{
    public virtual CreateTrafficPolicyInstanceResponse CreateTrafficPolicyInstance(CreateTrafficPolicyInstanceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateTrafficPolicyInstanceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateTrafficPolicyInstanceResponseUnmarshaller.Instance;
    return Invoke<CreateTrafficPolicyInstanceResponse>(request, options);
}
}