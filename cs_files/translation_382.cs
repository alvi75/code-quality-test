using System;
using System.Collections.Generic;

public class Translation382
{
    public virtual DeleteStackSetResponse DeleteStackSet(DeleteStackSetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteStackSetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteStackSetResponseUnmarshaller.Instance;
    return Invoke<DeleteStackSetResponse>(request, options);
}
}