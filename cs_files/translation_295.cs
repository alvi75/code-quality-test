using System;
using System.Collections.Generic;

public class Translation295
{
    public virtual GetCloudFrontOriginAccessIdentityConfigResponse GetCloudFrontOriginAccessIdentityConfig(GetCloudFrontOriginAccessIdentityConfigRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetCloudFrontOriginAccessIdentityConfigRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetCloudFrontOriginAccessIdentityConfigResponseUnmarshaller.Instance;
    return Invoke<GetCloudFrontOriginAccessIdentityConfigResponse>(request, options);
}
}