ublic GetApisResponse GetApis(GetApisRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetApisRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetApisResponseUnmarshaller.Instance;
    return Invoke<GetApisResponse>(request, options);
}