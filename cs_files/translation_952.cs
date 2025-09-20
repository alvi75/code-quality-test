using System;
using System.Collections.Generic;

public class Translation952
{
    public virtual DeregisterWorkspaceDirectoryResponse DeregisterWorkspaceDirectory(DeregisterWorkspaceDirectoryRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeregisterWorkspaceDirectoryRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeregisterWorkspaceDirectoryResponseUnmarshaller.Instance;
    return Invoke<DeregisterWorkspaceDirectoryResponse>(request, options);
}
}