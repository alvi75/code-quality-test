import java.util.*;

public class Translation973 {
    ublic DescribeConnectionsResponse DescribeConnections(DescribeConnectionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeConnectionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeConnectionsResponseUnmarshaller.Instance;
    return Invoke<DescribeConnectionsResponse>(request, options);
}
}