using System;
using System.Collections.Generic;

public class Translation804
{
    public virtual CreateProjectVersionResponse CreateProjectVersion(CreateProjectVersionRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateProjectVersionRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateProjectVersionResponseUnmarshaller.Instance;
    return Invoke<CreateProjectVersionResponse>(request, options);
}
}