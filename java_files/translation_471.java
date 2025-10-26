ublic SetTagsForResourceResponse SetTagsForResource(SetTagsForResourceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = SetTagsForResourceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = SetTagsForResourceResponseUnmarshaller.Instance;
    return Invoke<SetTagsForResourceResponse>(request, options);
}