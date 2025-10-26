ublic CreateSecurityConfigurationResponse CreateSecurityConfiguration(CreateSecurityConfigurationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateSecurityConfigurationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateSecurityConfigurationResponseUnmarshaller.Instance;
    return Invoke<CreateSecurityConfigurationResponse>(request, options);
}