using System;
using System.Collections.Generic;

public class Translation890
{
    public virtual EnableAlarmActionsResponse EnableAlarmActions(EnableAlarmActionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = EnableAlarmActionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = EnableAlarmActionsResponseUnmarshaller.Instance;
    return Invoke<EnableAlarmActionsResponse>(request, options);
}
}