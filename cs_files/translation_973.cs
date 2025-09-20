using System;
using System.Collections.Generic;

public class Translation973
{
    public virtual DescribeConnectionsResponse DescribeConnections(DescribeConnectionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeConnectionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeConnectionsResponseUnmarshaller.Instance;
    return Invoke<DescribeConnectionsResponse>(request, options);
}
}