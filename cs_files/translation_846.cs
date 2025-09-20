using System;
using System.Collections.Generic;

public class Translation846
{
    public virtual DescribeStackSetOperationResponse DescribeStackSetOperation(DescribeStackSetOperationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeStackSetOperationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeStackSetOperationResponseUnmarshaller.Instance;
    return Invoke<DescribeStackSetOperationResponse>(request, options);
}
}