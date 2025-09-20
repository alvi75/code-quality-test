using System;
using System.Collections.Generic;

public class Translation24
{
    public virtual ModifyCacheSubnetGroupResponse ModifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ModifyCacheSubnetGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ModifyCacheSubnetGroupResponseUnmarshaller.Instance;
    return Invoke<ModifyCacheSubnetGroupResponse>(request, options);
}
}