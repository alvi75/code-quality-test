using System;
using System.Collections.Generic;

public class Translation105
{
    public virtual DeleteWorkspaceImageResponse DeleteWorkspaceImage(DeleteWorkspaceImageRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteWorkspaceImageRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteWorkspaceImageResponseUnmarshaller.Instance;
    return Invoke<DeleteWorkspaceImageResponse>(request, options);
}
}