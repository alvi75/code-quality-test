ublic PutVoiceConnectorStreamingConfigurationResponse PutVoiceConnectorStreamingConfiguration(PutVoiceConnectorStreamingConfigurationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = PutVoiceConnectorStreamingConfigurationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = PutVoiceConnectorStreamingConfigurationResponseUnmarshaller.Instance;
    return Invoke<PutVoiceConnectorStreamingConfigurationResponse>(request, options);
}