using System;
using System.Collections.Generic;

public class Translation474
{
    public virtual EnableLoggingResponse EnableLogging(EnableLoggingRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = EnableLoggingRequestMarshaller.Instance;
    options.ResponseUnmarshaller = EnableLoggingResponseUnmarshaller.Instance;
    return Invoke<EnableLoggingResponse>(request, options);
}
}