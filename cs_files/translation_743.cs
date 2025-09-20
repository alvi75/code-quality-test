using System;
using System.Collections.Generic;

public class Translation743
{
    public virtual DescribeNetworkInterfacesResponse DescribeNetworkInterfaces(DescribeNetworkInterfacesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeNetworkInterfacesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeNetworkInterfacesResponseUnmarshaller.Instance;
    return Invoke<DescribeNetworkInterfacesResponse>(request, options);
}
}