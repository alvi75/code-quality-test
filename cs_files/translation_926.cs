using System;
using System.Collections.Generic;

public class Translation926
{
    public virtual TerminateClientVpnConnectionsResponse TerminateClientVpnConnections(TerminateClientVpnConnectionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = TerminateClientVpnConnectionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = TerminateClientVpnConnectionsResponseUnmarshaller.Instance;
    return Invoke<TerminateClientVpnConnectionsResponse>(request, options);
}
}