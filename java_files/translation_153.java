ublic GetContactMethodsResponse GetContactMethods(GetContactMethodsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetContactMethodsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetContactMethodsResponseUnmarshaller.Instance;
    return Invoke<GetContactMethodsResponse>(request, options);
}