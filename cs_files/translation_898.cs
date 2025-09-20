using System;
using System.Collections.Generic;

public class Translation898
{
    public virtual CreatePresignedDomainUrlResponse CreatePresignedDomainUrl(CreatePresignedDomainUrlRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreatePresignedDomainUrlRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreatePresignedDomainUrlResponseUnmarshaller.Instance;
    return Invoke<CreatePresignedDomainUrlResponse>(request, options);
}
}