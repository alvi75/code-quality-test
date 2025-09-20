using System;
using System.Collections.Generic;

public class Translation125
{
    public virtual ModifyDBProxyResponse ModifyDBProxy(ModifyDBProxyRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ModifyDBProxyRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ModifyDBProxyResponseUnmarshaller.Instance;
    return Invoke<ModifyDBProxyResponse>(request, options);
}
}