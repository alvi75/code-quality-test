using System;
using System.Collections.Generic;

public class Translation599
{
    public virtual DeletePushTemplateResponse DeletePushTemplate(DeletePushTemplateRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeletePushTemplateRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeletePushTemplateResponseUnmarshaller.Instance;
    return Invoke<DeletePushTemplateResponse>(request, options);
}
}