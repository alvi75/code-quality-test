ublic ListTemplatesResponse ListTemplates(ListTemplatesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListTemplatesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListTemplatesResponseUnmarshaller.Instance;
    return Invoke<ListTemplatesResponse>(request, options);
}