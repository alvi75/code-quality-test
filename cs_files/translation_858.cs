using System;
using System.Collections.Generic;

public class Translation858
{
    public virtual PutMetricDataResponse PutMetricData(PutMetricDataRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = PutMetricDataRequestMarshaller.Instance;
    options.ResponseUnmarshaller = PutMetricDataResponseUnmarshaller.Instance;
    return Invoke<PutMetricDataResponse>(request, options);
}
}