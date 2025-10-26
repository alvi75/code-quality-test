ublic GetVoiceConnectorProxyResponse GetVoiceConnectorProxy(GetVoiceConnectorProxyRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetVoiceConnectorProxyRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetVoiceConnectorProxyResponseUnmarshaller.Instance;
    return Invoke<GetVoiceConnectorProxyResponse>(request, options);
}