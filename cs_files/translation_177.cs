using System;
using System.Collections.Generic;

public class Translation177
{
    public virtual StopWorkspacesResponse StopWorkspaces(StopWorkspacesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StopWorkspacesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StopWorkspacesResponseUnmarshaller.Instance;
    return Invoke<StopWorkspacesResponse>(request, options);
}
}