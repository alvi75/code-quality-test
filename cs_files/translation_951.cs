using System;
using System.Collections.Generic;

public class Translation951
{
    public virtual CreateVpcEndpointResponse CreateVpcEndpoint(CreateVpcEndpointRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateVpcEndpointRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateVpcEndpointResponseUnmarshaller.Instance;
    return Invoke<CreateVpcEndpointResponse>(request, options);
}
}