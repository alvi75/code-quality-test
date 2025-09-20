using System;
using System.Collections.Generic;

public class Translation214
{
    public virtual GetDiskResponse GetDisk(GetDiskRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetDiskRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetDiskResponseUnmarshaller.Instance;
    return Invoke<GetDiskResponse>(request, options);
}
}