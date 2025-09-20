using System;
using System.Collections.Generic;

public class Translation249
{
    public virtual RegisterWorkspaceDirectoryResponse RegisterWorkspaceDirectory(RegisterWorkspaceDirectoryRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RegisterWorkspaceDirectoryRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RegisterWorkspaceDirectoryResponseUnmarshaller.Instance;
    return Invoke<RegisterWorkspaceDirectoryResponse>(request, options);
}
}