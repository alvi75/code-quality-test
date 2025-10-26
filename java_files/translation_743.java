import java.util.*;

public class Translation743 {
    ublic DescribeNetworkInterfacesResponse DescribeNetworkInterfaces(DescribeNetworkInterfacesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeNetworkInterfacesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeNetworkInterfacesResponseUnmarshaller.Instance;
    return Invoke<DescribeNetworkInterfacesResponse>(request, options);
}
}