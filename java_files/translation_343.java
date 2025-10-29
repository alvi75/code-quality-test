import java.util.*;

public class Translation343 {
    ublic DescribeLocalGatewayVirtualInterfacesResponse DescribeLocalGatewayVirtualInterfaces(DescribeLocalGatewayVirtualInterfacesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeLocalGatewayVirtualInterfacesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeLocalGatewayVirtualInterfacesResponseUnmarshaller.Instance;
    return Invoke<DescribeLocalGatewayVirtualInterfacesResponse>(request, options);
}
}