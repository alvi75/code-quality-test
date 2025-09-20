using System;
using System.Collections.Generic;

public class Translation427
{
    public virtual ListExclusionsResponse ListExclusions(ListExclusionsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListExclusionsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListExclusionsResponseUnmarshaller.Instance;
    return Invoke<ListExclusionsResponse>(request, options);
}
}