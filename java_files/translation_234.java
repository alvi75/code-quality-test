import java.util.*;

public class Translation234 {
    ublic DescribeStreamProcessorResponse DescribeStreamProcessor(DescribeStreamProcessorRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeStreamProcessorRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeStreamProcessorResponseUnmarshaller.Instance;
    return Invoke<DescribeStreamProcessorResponse>(request, options);
}
}