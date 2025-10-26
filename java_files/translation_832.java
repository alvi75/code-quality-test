ublic DeleteRouteTableResponse DeleteRouteTable(DeleteRouteTableRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteRouteTableRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteRouteTableResponseUnmarshaller.Instance;
    return Invoke<DeleteRouteTableResponse>(request, options);
}