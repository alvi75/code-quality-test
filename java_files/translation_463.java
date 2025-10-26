import java.util.*;

public class Translation463 {
    ublic DeregisterTransitGatewayMulticastGroupMembersResponse DeregisterTransitGatewayMulticastGroupMembers(DeregisterTransitGatewayMulticastGroupMembersRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeregisterTransitGatewayMulticastGroupMembersRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeregisterTransitGatewayMulticastGroupMembersResponseUnmarshaller.Instance;
    return Invoke<DeregisterTransitGatewayMulticastGroupMembersResponse>(request, options);
}
}