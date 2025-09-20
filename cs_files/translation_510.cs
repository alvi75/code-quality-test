using System;
using System.Collections.Generic;

public class Translation510
{
    public virtual GetPersonTrackingResponse GetPersonTracking(GetPersonTrackingRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetPersonTrackingRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetPersonTrackingResponseUnmarshaller.Instance;
    return Invoke<GetPersonTrackingResponse>(request, options);
}
}