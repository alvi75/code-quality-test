import java.util.*;

public class Translation463 {
    ublic DeregisterTransitGatewayMulticastGroupMembersResult deregisterTransitGatewayMulticastGroupMembers(DeregisterTransitGatewayMulticastGroupMembersRequest request) {
    var options = new InvokeOptions();
    options.RequestMarshaller = DeregisterTransitGatewayMulticastGroupMembersRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeregisterTransitGatewayMulticastGroupMembersResponseUnmarshaller.Instance;
    return Invoke<DeregisterTransitGatewayMulticastGroupMembersResult>(request, options);
}
}