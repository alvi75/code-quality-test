ublic UpdateApiKeyResponse UpdateApiKey(UpdateApiKeyRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateApiKeyRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateApiKeyResponseUnmarshaller.Instance;
    return Invoke<UpdateApiKeyResponse>(request, options);
}