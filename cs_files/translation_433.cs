using System;
using System.Collections.Generic;

public class Translation433
{
    public virtual BacktrackDBClusterResponse BacktrackDBCluster(BacktrackDBClusterRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = BacktrackDBClusterRequestMarshaller.Instance;
    options.ResponseUnmarshaller = BacktrackDBClusterResponseUnmarshaller.Instance;
    return Invoke<BacktrackDBClusterResponse>(request, options);
}
}