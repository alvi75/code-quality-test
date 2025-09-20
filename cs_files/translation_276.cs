using System;
using System.Collections.Generic;

public class Translation276
{
    public virtual CreateDBSubnetGroupResponse CreateDBSubnetGroup(CreateDBSubnetGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateDBSubnetGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateDBSubnetGroupResponseUnmarshaller.Instance;
    return Invoke<CreateDBSubnetGroupResponse>(request, options);
}
}