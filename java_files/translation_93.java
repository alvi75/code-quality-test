import java.util.*;

public class Translation93 {
    ublic DescribeTransitGatewayVpcAttachmentsResponse DescribeTransitGatewayVpcAttachments(DescribeTransitGatewayVpcAttachmentsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeTransitGatewayVpcAttachmentsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeTransitGatewayVpcAttachmentsResponseUnmarshaller.Instance;
    return Invoke<DescribeTransitGatewayVpcAttachmentsResponse>(request, options);
}
}