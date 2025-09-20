using System;
using System.Collections.Generic;

public class Translation463
{
    public virtual DeregisterTransitGatewayMulticastGroupMembersResponse DeregisterTransitGatewayMulticastGroupMembers(DeregisterTransitGatewayMulticastGroupMembersRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeregisterTransitGatewayMulticastGroupMembersRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeregisterTransitGatewayMulticastGroupMembersResponseUnmarshaller.Instance;
    return Invoke<DeregisterTransitGatewayMulticastGroupMembersResponse>(request, options);
}
}