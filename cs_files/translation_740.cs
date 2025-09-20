using System;
using System.Collections.Generic;

public class Translation740
{
    public virtual DeleteApiKeyResponse DeleteApiKey(DeleteApiKeyRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteApiKeyRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteApiKeyResponseUnmarshaller.Instance;
    return Invoke<DeleteApiKeyResponse>(request, options);
}
}