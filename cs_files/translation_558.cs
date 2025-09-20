using System;
using System.Collections.Generic;

public class Translation558
{
    public virtual GetPushTemplateResponse GetPushTemplate(GetPushTemplateRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetPushTemplateRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetPushTemplateResponseUnmarshaller.Instance;
    return Invoke<GetPushTemplateResponse>(request, options);
}
}