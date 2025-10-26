ublic TagResourceResponse TagResource(TagResourceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = TagResourceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = TagResourceResponseUnmarshaller.Instance;
    return Invoke<TagResourceResponse>(request, options);
}