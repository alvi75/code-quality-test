using System;
using System.Collections.Generic;

public class Translation933
{
    public virtual CreateCloudFrontOriginAccessIdentityResponse CreateCloudFrontOriginAccessIdentity(CreateCloudFrontOriginAccessIdentityRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateCloudFrontOriginAccessIdentityRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateCloudFrontOriginAccessIdentityResponseUnmarshaller.Instance;
    return Invoke<CreateCloudFrontOriginAccessIdentityResponse>(request, options);
}
}