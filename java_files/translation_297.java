ublic DeleteTransitGatewayResponse DeleteTransitGateway(DeleteTransitGatewayRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteTransitGatewayRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteTransitGatewayResponseUnmarshaller.Instance;
    return Invoke<DeleteTransitGatewayResponse>(request, options);
}