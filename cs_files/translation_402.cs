using System;
using System.Collections.Generic;

public class Translation402
{
    public virtual DeleteClusterResponse DeleteCluster(DeleteClusterRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteClusterRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteClusterResponseUnmarshaller.Instance;
    return Invoke<DeleteClusterResponse>(request, options);
}
}