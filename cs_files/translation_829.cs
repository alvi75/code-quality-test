using System;
using System.Collections.Generic;

public class Translation829
{
    public virtual DescribeExperimentResponse DescribeExperiment(DescribeExperimentRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeExperimentRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeExperimentResponseUnmarshaller.Instance;
    return Invoke<DescribeExperimentResponse>(request, options);
}
}