import java.util.*;

public class Translation746 {
    ublic DescribeClientVpnConnectionsResponse DescribeClientVpnConnections(DescribeClientVpnConnectionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeClientVpnConnectionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeClientVpnConnectionsResponseUnmarshaller.Instance;
    return Invoke<DescribeClientVpnConnectionsResponse>(request, options);
}
}