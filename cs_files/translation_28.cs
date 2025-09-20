using System;
using System.Collections.Generic;

public class Translation28
{
    public virtual GetInstanceAccessDetailsResponse GetInstanceAccessDetails(GetInstanceAccessDetailsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetInstanceAccessDetailsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetInstanceAccessDetailsResponseUnmarshaller.Instance;
    return Invoke<GetInstanceAccessDetailsResponse>(request, options);
}
}