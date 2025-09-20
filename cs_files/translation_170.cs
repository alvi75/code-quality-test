using System;
using System.Collections.Generic;

public class Translation170
{
    public virtual ListStreamProcessorsResponse ListStreamProcessors(ListStreamProcessorsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListStreamProcessorsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListStreamProcessorsResponseUnmarshaller.Instance;
    return Invoke<ListStreamProcessorsResponse>(request, options);
}
}