using System;
using System.Collections.Generic;

public class Translation446
{
    public virtual SetTerminationProtectionResponse SetTerminationProtection(SetTerminationProtectionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = SetTerminationProtectionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = SetTerminationProtectionResponseUnmarshaller.Instance;
    return Invoke<SetTerminationProtectionResponse>(request, options);
}
}