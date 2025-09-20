using System;
using System.Collections.Generic;

public class Translation464
{
    public virtual BatchDeleteScheduledActionResponse BatchDeleteScheduledAction(BatchDeleteScheduledActionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = BatchDeleteScheduledActionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = BatchDeleteScheduledActionResponseUnmarshaller.Instance;
    return Invoke<BatchDeleteScheduledActionResponse>(request, options);
}
}