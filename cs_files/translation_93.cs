using System;
using System.Collections.Generic;

public class Translation93
{
    public virtual DescribeTransitGatewayVpcAttachmentsResponse DescribeTransitGatewayVpcAttachments(DescribeTransitGatewayVpcAttachmentsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeTransitGatewayVpcAttachmentsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeTransitGatewayVpcAttachmentsResponseUnmarshaller.Instance;
    return Invoke<DescribeTransitGatewayVpcAttachmentsResponse>(request, options);
}
}