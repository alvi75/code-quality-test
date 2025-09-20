using System;
using System.Collections.Generic;

public class Translation406
{
    public virtual UpdateParameterGroupResponse UpdateParameterGroup(UpdateParameterGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateParameterGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateParameterGroupResponseUnmarshaller.Instance;
    return Invoke<UpdateParameterGroupResponse>(request, options);
}
}