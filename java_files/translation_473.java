import java.util.*;

public class Translation473 {
    ublic DescribeVpcEndpointServicesResponse DescribeVpcEndpointServices(DescribeVpcEndpointServicesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeVpcEndpointServicesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeVpcEndpointServicesResponseUnmarshaller.Instance;
    return Invoke<DescribeVpcEndpointServicesResponse>(request, options);
}
}