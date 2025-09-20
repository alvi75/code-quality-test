using System;
using System.Collections.Generic;

public class Translation163
{
    public virtual ReportInstanceStatusResponse ReportInstanceStatus(ReportInstanceStatusRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ReportInstanceStatusRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ReportInstanceStatusResponseUnmarshaller.Instance;
    return Invoke<ReportInstanceStatusResponse>(request, options);
}
}