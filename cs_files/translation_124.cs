using System;
using System.Collections.Generic;

public class Translation124
{
    public virtual SetInstanceProtectionResponse SetInstanceProtection(SetInstanceProtectionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = SetInstanceProtectionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = SetInstanceProtectionResponseUnmarshaller.Instance;
    return Invoke<SetInstanceProtectionResponse>(request, options);
}
}