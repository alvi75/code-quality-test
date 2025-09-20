using System;
using System.Collections.Generic;

public class Translation834
{
    public virtual PutIntegrationResponse PutIntegration(PutIntegrationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = PutIntegrationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = PutIntegrationResponseUnmarshaller.Instance;
    return Invoke<PutIntegrationResponse>(request, options);
}
}