using System;
using System.Collections.Generic;

public class Translation454
{
    public virtual SuspendGameServerGroupResponse SuspendGameServerGroup(SuspendGameServerGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = SuspendGameServerGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = SuspendGameServerGroupResponseUnmarshaller.Instance;
    return Invoke<SuspendGameServerGroupResponse>(request, options);
}
}