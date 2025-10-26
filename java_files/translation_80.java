ublic CreateVpnConnectionResponse CreateVpnConnection(CreateVpnConnectionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateVpnConnectionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateVpnConnectionResponseUnmarshaller.Instance;
    return Invoke<CreateVpnConnectionResponse>(request, options);
}