using System;
using System.Collections.Generic;

public class Translation82
{
    public virtual ListMonitoringExecutionsResponse ListMonitoringExecutions(ListMonitoringExecutionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListMonitoringExecutionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListMonitoringExecutionsResponseUnmarshaller.Instance;
    return Invoke<ListMonitoringExecutionsResponse>(request, options);
}
}