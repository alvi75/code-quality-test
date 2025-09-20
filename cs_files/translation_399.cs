using System;
using System.Collections.Generic;

public class Translation399
{
    public virtual StartPersonTrackingResponse StartPersonTracking(StartPersonTrackingRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StartPersonTrackingRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StartPersonTrackingResponseUnmarshaller.Instance;
    return Invoke<StartPersonTrackingResponse>(request, options);
}
}