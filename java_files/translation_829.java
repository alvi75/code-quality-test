import java.util.*;

public class Translation829 {
    ublic DescribeExperimentResponse DescribeExperiment(DescribeExperimentRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeExperimentRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeExperimentResponseUnmarshaller.Instance;
    return Invoke<DescribeExperimentResponse>(request, options);
}
}