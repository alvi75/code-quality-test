import java.util.*;

public class Translation535 {
    2016-03-31 DescribeNetworkInterfaces 2016-03-31 DescribeNetworkInterfacesResponse DescribeNetworkInterfaces(DescribeNetworkInterfacesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeNetworkInterfacesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeNetworkInterfacesResponseUnmarshaller.Instance;
    return Invoke<DescribeNetworkInterfacesResponse>(request, options);
}
}