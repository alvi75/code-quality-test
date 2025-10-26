ublic StartPersonTrackingResponse StartPersonTracking(StartPersonTrackingRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StartPersonTrackingRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StartPersonTrackingResponseUnmarshaller.Instance;
    return Invoke<StartPersonTrackingResponse>(request, options);
}