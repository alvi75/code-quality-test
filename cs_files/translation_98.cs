using System;
using System.Collections.Generic;

public class Translation98
{
    public virtual CreateWorkspacesResponse CreateWorkspaces(CreateWorkspacesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateWorkspacesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateWorkspacesResponseUnmarshaller.Instance;
    return Invoke<CreateWorkspacesResponse>(request, options);
}
}