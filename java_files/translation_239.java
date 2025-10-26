import java.util.*;

public class Translation239 {
    ublic DescribeStackEventsResponse DescribeStackEvents(DescribeStackEventsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeStackEventsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeStackEventsResponseUnmarshaller.Instance;
    return Invoke<DescribeStackEventsResponse>(request, options);
}
}