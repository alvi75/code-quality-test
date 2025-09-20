using System;
using System.Collections.Generic;

public class Translation22
{
    public virtual TagQueueResponse TagQueue(TagQueueRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = TagQueueRequestMarshaller.Instance;
    options.ResponseUnmarshaller = TagQueueResponseUnmarshaller.Instance;
    return Invoke<TagQueueResponse>(request, options);
}
}