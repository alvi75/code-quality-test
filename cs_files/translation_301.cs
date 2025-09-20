using System;
using System.Collections.Generic;

public class Translation301
{
    public virtual GetLaunchTemplateDataResponse GetLaunchTemplateData(GetLaunchTemplateDataRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetLaunchTemplateDataRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetLaunchTemplateDataResponseUnmarshaller.Instance;
    return Invoke<GetLaunchTemplateDataResponse>(request, options);
}
}