ublic DeleteVoiceConnectorResponse DeleteVoiceConnector(DeleteVoiceConnectorRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteVoiceConnectorRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteVoiceConnectorResponseUnmarshaller.Instance;
    return Invoke<DeleteVoiceConnectorResponse>(request, options);
}