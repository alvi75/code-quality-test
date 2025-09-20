using System;
using System.Collections.Generic;

public class Translation613
{
    public virtual DeleteReplicationGroupResponse DeleteReplicationGroup(DeleteReplicationGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteReplicationGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteReplicationGroupResponseUnmarshaller.Instance;
    return Invoke<DeleteReplicationGroupResponse>(request, options);
}
}