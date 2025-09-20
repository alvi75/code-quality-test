using System;
using System.Collections.Generic;

public class Translation239
{
    public virtual DescribeStackEventsResponse DescribeStackEvents(DescribeStackEventsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeStackEventsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeStackEventsResponseUnmarshaller.Instance;
    return Invoke<DescribeStackEventsResponse>(request, options);
}
}