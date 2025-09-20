using System;
using System.Collections.Generic;

public class Translation246
{
    public virtual CreateGatewayGroupResponse CreateGatewayGroup(CreateGatewayGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateGatewayGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateGatewayGroupResponseUnmarshaller.Instance;
    return Invoke<CreateGatewayGroupResponse>(request, options);
}
}