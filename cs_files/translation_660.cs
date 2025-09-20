using System;
using System.Collections.Generic;

public class Translation660
{
    public virtual UpdateConfigurationProfileResponse UpdateConfigurationProfile(UpdateConfigurationProfileRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = UpdateConfigurationProfileRequestMarshaller.Instance;
    options.ResponseUnmarshaller = UpdateConfigurationProfileResponseUnmarshaller.Instance;
    return Invoke<UpdateConfigurationProfileResponse>(request, options);
}
}