using System;
using System.Collections.Generic;

public class Translation320
{
    public virtual UpdateApiKeyResponse UpdateApiKey(UpdateApiKeyRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateApiKeyRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateApiKeyResponseUnmarshaller.Instance;
    return Invoke<UpdateApiKeyResponse>(request, options);
}
}