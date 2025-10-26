ublic ListPublishingDestinationsResponse ListPublishingDestinations(ListPublishingDestinationsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListPublishingDestinationsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListPublishingDestinationsResponseUnmarshaller.Instance;
    return Invoke<ListPublishingDestinationsResponse>(request, options);
}