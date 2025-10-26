ublic ListVoiceConnectorTerminationCredentialsResponse ListVoiceConnectorTerminationCredentials(ListVoiceConnectorTerminationCredentialsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListVoiceConnectorTerminationCredentialsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListVoiceConnectorTerminationCredentialsResponseUnmarshaller.Instance;
    return Invoke<ListVoiceConnectorTerminationCredentialsResponse>(request, options);
}