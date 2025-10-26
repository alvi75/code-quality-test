ublic BatchDeleteScheduledActionResponse BatchDeleteScheduledAction(BatchDeleteScheduledActionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = BatchDeleteScheduledActionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = BatchDeleteScheduledActionResponseUnmarshaller.Instance;
    return Invoke<BatchDeleteScheduledActionResponse>(request, options);
}