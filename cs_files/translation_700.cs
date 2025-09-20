using System;
using System.Collections.Generic;

public class Translation700
{
    public virtual DisableAddOnResponse DisableAddOn(DisableAddOnRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DisableAddOnRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DisableAddOnResponseUnmarshaller.Instance;
    return Invoke<DisableAddOnResponse>(request, options);
}
}