using System;
using System.Collections.Generic;

public class Translation348
{
    public virtual ActivateEventSourceResponse ActivateEventSource(ActivateEventSourceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ActivateEventSourceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ActivateEventSourceResponseUnmarshaller.Instance;
    return Invoke<ActivateEventSourceResponse>(request, options);
}
}