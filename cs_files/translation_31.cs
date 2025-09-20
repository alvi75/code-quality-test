using System;
using System.Collections.Generic;

public class Translation31
{
    public virtual GetDashboardResponse GetDashboard(GetDashboardRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetDashboardRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetDashboardResponseUnmarshaller.Instance;
    return Invoke<GetDashboardResponse>(request, options);
}
}