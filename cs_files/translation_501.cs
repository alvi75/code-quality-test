using System;
using System.Collections.Generic;

public class Translation501
{
    public virtual CreateConfigurationSetResponse CreateConfigurationSet(CreateConfigurationSetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateConfigurationSetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateConfigurationSetResponseUnmarshaller.Instance;
    return Invoke<CreateConfigurationSetResponse>(request, options);
}
}