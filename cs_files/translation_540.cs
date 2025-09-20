using System;
using System.Collections.Generic;

public class Translation540
{
    public virtual CreateScriptResponse CreateScript(CreateScriptRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateScriptRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateScriptResponseUnmarshaller.Instance;
    return Invoke<CreateScriptResponse>(request, options);
}
}