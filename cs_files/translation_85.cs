using System;
using System.Collections.Generic;

public class Translation85
{
    public virtual GetApisResponse GetApis(GetApisRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetApisRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetApisResponseUnmarshaller.Instance;
    return Invoke<GetApisResponse>(request, options);
}
}