using System;
using System.Collections.Generic;

public class Translation211
{
    public virtual ListAssociatedStacksResponse ListAssociatedStacks(ListAssociatedStacksRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListAssociatedStacksRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListAssociatedStacksResponseUnmarshaller.Instance;
    return Invoke<ListAssociatedStacksResponse>(request, options);
}
}