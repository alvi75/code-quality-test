using System;
using System.Collections.Generic;

public class Translation401
{
    public virtual GetRouteResponse GetRoute(GetRouteRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetRouteRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetRouteResponseUnmarshaller.Instance;
    return Invoke<GetRouteResponse>(request, options);
}
}