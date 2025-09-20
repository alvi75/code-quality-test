using System;
using System.Collections.Generic;

public class Translation473
{
    public virtual DescribeVpcEndpointServicesResponse DescribeVpcEndpointServices(DescribeVpcEndpointServicesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeVpcEndpointServicesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeVpcEndpointServicesResponseUnmarshaller.Instance;
    return Invoke<DescribeVpcEndpointServicesResponse>(request, options);
}
}