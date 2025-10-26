ublic CreateProxySessionResponse CreateProxySession(CreateProxySessionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateProxySessionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateProxySessionResponseUnmarshaller.Instance;
    return Invoke<CreateProxySessionResponse>(request, options);
}