using System;
using System.Collections.Generic;

public class Translation981
{
    public virtual RegisterTransitGatewayMulticastGroupMembersResponse RegisterTransitGatewayMulticastGroupMembers(RegisterTransitGatewayMulticastGroupMembersRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RegisterTransitGatewayMulticastGroupMembersRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RegisterTransitGatewayMulticastGroupMembersResponseUnmarshaller.Instance;
    return Invoke<RegisterTransitGatewayMulticastGroupMembersResponse>(request, options);
}
}