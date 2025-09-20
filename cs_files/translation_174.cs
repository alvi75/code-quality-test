using System;
using System.Collections.Generic;

public class Translation174
{
    public virtual GetOperationsResponse GetOperations(GetOperationsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetOperationsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetOperationsResponseUnmarshaller.Instance;
    return Invoke<GetOperationsResponse>(request, options);
}
}