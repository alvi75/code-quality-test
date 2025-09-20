using System;
using System.Collections.Generic;

public class Translation218
{
    public virtual DescribeGameServerGroupResponse DescribeGameServerGroup(DescribeGameServerGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeGameServerGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeGameServerGroupResponseUnmarshaller.Instance;
    return Invoke<DescribeGameServerGroupResponse>(request, options);
}
}