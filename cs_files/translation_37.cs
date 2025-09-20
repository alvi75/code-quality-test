using System;
using System.Collections.Generic;

public class Translation37
{
    public virtual GetIceServerConfigResponse GetIceServerConfig(GetIceServerConfigRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetIceServerConfigRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetIceServerConfigResponseUnmarshaller.Instance;
    return Invoke<GetIceServerConfigResponse>(request, options);
}
}