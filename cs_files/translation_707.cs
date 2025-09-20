using System;
using System.Collections.Generic;

public class Translation707
{
    public virtual DescribeSignalingChannelResponse DescribeSignalingChannel(DescribeSignalingChannelRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeSignalingChannelRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeSignalingChannelResponseUnmarshaller.Instance;
    return Invoke<DescribeSignalingChannelResponse>(request, options);
}
}