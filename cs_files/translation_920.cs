using System;
using System.Collections.Generic;

public class Translation920
{
    public virtual GetGatewayGroupResponse GetGatewayGroup(GetGatewayGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetGatewayGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetGatewayGroupResponseUnmarshaller.Instance;
    return Invoke<GetGatewayGroupResponse>(request, options);
}
}