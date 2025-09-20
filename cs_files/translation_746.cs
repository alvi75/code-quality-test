using System;
using System.Collections.Generic;

public class Translation746
{
    public virtual DescribeClientVpnConnectionsResponse DescribeClientVpnConnections(DescribeClientVpnConnectionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeClientVpnConnectionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeClientVpnConnectionsResponseUnmarshaller.Instance;
    return Invoke<DescribeClientVpnConnectionsResponse>(request, options);
}
}