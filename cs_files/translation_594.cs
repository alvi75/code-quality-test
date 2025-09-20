using System;
using System.Collections.Generic;

public class Translation594
{
    public virtual ListComponentsResponse ListComponents(ListComponentsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListComponentsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListComponentsResponseUnmarshaller.Instance;
    return Invoke<ListComponentsResponse>(request, options);
}
}