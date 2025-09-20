using System;
using System.Collections.Generic;

public class Translation982
{
    public virtual GetPhoneNumberSettingsResponse GetPhoneNumberSettings(GetPhoneNumberSettingsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetPhoneNumberSettingsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetPhoneNumberSettingsResponseUnmarshaller.Instance;
    return Invoke<GetPhoneNumberSettingsResponse>(request, options);
}
}