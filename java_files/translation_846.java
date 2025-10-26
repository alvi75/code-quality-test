import java.util.*;

public class Translation846 {
    ublic DescribeStackSetOperationResponse DescribeStackSetOperation(DescribeStackSetOperationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeStackSetOperationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeStackSetOperationResponseUnmarshaller.Instance;
    return Invoke<DescribeStackSetOperationResponse>(request, options);
}
}