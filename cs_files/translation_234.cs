using System;
using System.Collections.Generic;

public class Translation234
{
    public virtual DescribeStreamProcessorResponse DescribeStreamProcessor(DescribeStreamProcessorRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeStreamProcessorRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeStreamProcessorResponseUnmarshaller.Instance;
    return Invoke<DescribeStreamProcessorResponse>(request, options);
}
}