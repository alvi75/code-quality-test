using System;
using System.Collections.Generic;

public class Translation141
{
    public virtual GetThreatIntelSetResponse GetThreatIntelSet(GetThreatIntelSetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetThreatIntelSetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetThreatIntelSetResponseUnmarshaller.Instance;
    return Invoke<GetThreatIntelSetResponse>(request, options);
}
}