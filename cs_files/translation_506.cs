using System;
using System.Collections.Generic;

public class Translation506
{
    public virtual TagResourceResponse TagResource(TagResourceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = TagResourceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = TagResourceResponseUnmarshaller.Instance;
    return Invoke<TagResourceResponse>(request, options);
}
}