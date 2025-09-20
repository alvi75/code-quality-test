using System;
using System.Collections.Generic;

public class Translation287
{
    public virtual ReleaseHostsResponse ReleaseHosts(ReleaseHostsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ReleaseHostsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ReleaseHostsResponseUnmarshaller.Instance;
    return Invoke<ReleaseHostsResponse>(request, options);
}
}