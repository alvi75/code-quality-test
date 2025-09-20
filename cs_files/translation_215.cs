using System;
using System.Collections.Generic;

public class Translation215
{
    public virtual CreateDBClusterParameterGroupResponse CreateDBClusterParameterGroup(CreateDBClusterParameterGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateDBClusterParameterGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateDBClusterParameterGroupResponseUnmarshaller.Instance;
    return Invoke<CreateDBClusterParameterGroupResponse>(request, options);
}
}