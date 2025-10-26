ublic GetIceServerConfigResponse GetIceServerConfig(GetIceServerConfigRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetIceServerConfigRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetIceServerConfigResponseUnmarshaller.Instance;
    return Invoke<GetIceServerConfigResponse>(request, options);
}