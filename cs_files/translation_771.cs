using System;
using System.Collections.Generic;

public class Translation771
{
    public virtual DeleteClusterSubnetGroupResponse DeleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteClusterSubnetGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteClusterSubnetGroupResponseUnmarshaller.Instance;
    return Invoke<DeleteClusterSubnetGroupResponse>(request, options);
}
}