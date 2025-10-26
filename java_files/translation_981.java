ublic RegisterTransitGatewayMulticastGroupMembersResponse RegisterTransitGatewayMulticastGroupMembers(RegisterTransitGatewayMulticastGroupMembersRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RegisterTransitGatewayMulticastGroupMembersRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RegisterTransitGatewayMulticastGroupMembersResponseUnmarshaller.Instance;
    return Invoke<RegisterTransitGatewayMulticastGroupMembersResponse>(request, options);
}