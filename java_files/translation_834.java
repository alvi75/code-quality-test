ublic PutIntegrationResponse PutIntegration(PutIntegrationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = PutIntegrationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = PutIntegrationResponseUnmarshaller.Instance;
    return Invoke<PutIntegrationResponse>(request, options);
}