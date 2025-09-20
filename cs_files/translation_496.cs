using System;
using System.Collections.Generic;

public class Translation496
{
    public virtual StartTaskResponse StartTask(StartTaskRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = StartTaskRequestMarshaller.Instance;
    options.ResponseUnmarshaller = StartTaskResponseUnmarshaller.Instance;
    return Invoke<StartTaskResponse>(request, options);
}
}