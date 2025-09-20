using System;
using System.Collections.Generic;

public class Translation213
{
    public virtual DescribeByoipCidrsResponse DescribeByoipCidrs(DescribeByoipCidrsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeByoipCidrsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeByoipCidrsResponseUnmarshaller.Instance;
    return Invoke<DescribeByoipCidrsResponse>(request, options);
}
}