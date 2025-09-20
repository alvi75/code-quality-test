using System;
using System.Collections.Generic;

public class Translation159
{
    public virtual PutLifecycleEventHookExecutionStatusResponse PutLifecycleEventHookExecutionStatus(PutLifecycleEventHookExecutionStatusRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = PutLifecycleEventHookExecutionStatusRequestMarshaller.Instance;
    options.ResponseUnmarshaller = PutLifecycleEventHookExecutionStatusResponseUnmarshaller.Instance;
    return Invoke<PutLifecycleEventHookExecutionStatusResponse>(request, options);
}
}