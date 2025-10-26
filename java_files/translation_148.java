ublic RequestSpotInstancesResponse RequestSpotInstances(RequestSpotInstancesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RequestSpotInstancesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RequestSpotInstancesResponseUnmarshaller.Instance;
    return Invoke<RequestSpotInstancesResponse>(request, options);
}