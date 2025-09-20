using System;
using System.Collections.Generic;

public class Translation122
{
    public virtual CancelUpdateStackResponse CancelUpdateStack(CancelUpdateStackRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CancelUpdateStackRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CancelUpdateStackResponseUnmarshaller.Instance;
    return Invoke<CancelUpdateStackResponse>(request, options);
}
}