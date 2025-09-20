using System;
using System.Collections.Generic;

public class Translation368
{
    public virtual SetIdentityPoolConfigurationResponse SetIdentityPoolConfiguration(SetIdentityPoolConfigurationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = SetIdentityPoolConfigurationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = SetIdentityPoolConfigurationResponseUnmarshaller.Instance;
    return Invoke<SetIdentityPoolConfigurationResponse>(request, options);
}
}