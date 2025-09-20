using System;
using System.Collections.Generic;

public class Translation343
{
    public virtual DescribeLocalGatewayVirtualInterfacesResponse DescribeLocalGatewayVirtualInterfaces(DescribeLocalGatewayVirtualInterfacesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeLocalGatewayVirtualInterfacesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeLocalGatewayVirtualInterfacesResponseUnmarshaller.Instance;
    return Invoke<DescribeLocalGatewayVirtualInterfacesResponse>(request, options);
}
}