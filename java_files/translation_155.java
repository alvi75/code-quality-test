import java.util.*;

public class Translation155 {
    ublic DescribeAnomalyDetectorsResponse DescribeAnomalyDetectors(DescribeAnomalyDetectorsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeAnomalyDetectorsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeAnomalyDetectorsResponseUnmarshaller.Instance;
    return Invoke<DescribeAnomalyDetectorsResponse>(request, options);
}
}