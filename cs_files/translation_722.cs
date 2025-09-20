using System;
using System.Collections.Generic;

public class Translation722
{
    public virtual RespondActivityTaskCompletedResponse RespondActivityTaskCompleted(RespondActivityTaskCompletedRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RespondActivityTaskCompletedRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RespondActivityTaskCompletedResponseUnmarshaller.Instance;
    return Invoke<RespondActivityTaskCompletedResponse>(request, options);
}
}