using System;
using System.Collections.Generic;

public class Translation652
{
    public virtual GetApiMappingResponse GetApiMapping(GetApiMappingRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetApiMappingRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetApiMappingResponseUnmarshaller.Instance;
    return Invoke<GetApiMappingResponse>(request, options);
}
}