using System;
using System.Collections.Generic;

public class Translation583
{
    public virtual GetFindingsResponse GetFindings(GetFindingsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetFindingsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetFindingsResponseUnmarshaller.Instance;
    return Invoke<GetFindingsResponse>(request, options);
}
}