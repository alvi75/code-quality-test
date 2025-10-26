ublic ListStreamProcessorsResponse ListStreamProcessors(ListStreamProcessorsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListStreamProcessorsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListStreamProcessorsResponseUnmarshaller.Instance;
    return Invoke<ListStreamProcessorsResponse>(request, options);
}