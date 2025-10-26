ublic ActivateEventSourceResponse ActivateEventSource(ActivateEventSourceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ActivateEventSourceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ActivateEventSourceResponseUnmarshaller.Instance;
    return Invoke<ActivateEventSourceResponse>(request, options);
}