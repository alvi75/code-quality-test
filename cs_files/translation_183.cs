using System;
using System.Collections.Generic;

public class Translation183
{
    public virtual DescribeResizeResponse DescribeResize(DescribeResizeRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeResizeRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeResizeResponseUnmarshaller.Instance;
    return Invoke<DescribeResizeResponse>(request, options);
}
}