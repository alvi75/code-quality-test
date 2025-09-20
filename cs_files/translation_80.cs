using System;
using System.Collections.Generic;

public class Translation80
{
    public virtual CreateVpnConnectionResponse CreateVpnConnection(CreateVpnConnectionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateVpnConnectionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateVpnConnectionResponseUnmarshaller.Instance;
    return Invoke<CreateVpnConnectionResponse>(request, options);
}
}