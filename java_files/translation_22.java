ublic TagQueueResponse TagQueue(TagQueueRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = TagQueueRequestMarshaller.Instance;
    options.ResponseUnmarshaller = TagQueueResponseUnmarshaller.Instance;
    return Invoke<TagQueueResponse>(request, options);
}