import java.util.*;

public class Translation81 {
    ublic DescribeVoicesResponse DescribeVoices(DescribeVoicesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeVoicesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeVoicesResponseUnmarshaller.Instance;
    return Invoke<DescribeVoicesResponse>(request, options);
}
}