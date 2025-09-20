using System;
using System.Collections.Generic;

public class Translation509
{
    public virtual ResumeProcessesResponse ResumeProcesses(ResumeProcessesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ResumeProcessesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ResumeProcessesResponseUnmarshaller.Instance;
    return Invoke<ResumeProcessesResponse>(request, options);
}
}